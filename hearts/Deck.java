/*
 * Deck defines a class of objects that represent groups of cards. The program
 * includes four constructors, methods to shuffle and sort, and two toString methods.
 */

package hearts;
import io.*;
import java.util.Random;

public class Deck{
    public Card[] deck;
    
    /*declaring a size creates an empty deck of the given size*/
    public Deck(int size){
        deck = new Card[size];
    }
    
    /*constructing a deck with no size parameter defaults to a full deck*/
    public Deck(){
        int count=0;
        deck = new Card[52];
        for (int suit=0;suit<4;suit++){
            for (int number=0;number<13;number++){
                deck[count] = new Card(number,suit);
                count++;
            }
        }
    }
    
    /*constructing a deck from a string*/
    public Deck(String str){
        //parse the string into tokens
        String delims = "[ ,.]";
        String[] tokens = str.split(delims);
        //create an empty deck of correct size
        deck = new Card[tokens.length];
        //step through the tokens, convert each to card, place in deck
        for (int i=0; i<tokens.length; i++){
            deck[i] =  new Card(tokens[i]);
        }
    }
    
    /*takes a deck and returns a sub-deck of all the cards of the chosen suit*/
    public Deck(int suit, Deck d){
        int count = 0;
        for (int i=0;i<d.deck.length;i++){
            if (d.deck[i].getSuit()==suit){
                count++;
            }
        }
        deck = new Card[count];
        count = 0;
        for (int i=0; i<d.deck.length; i++){
            if (d.deck[i].getSuit()==suit){
                deck[count] = d.deck[i];
                count++;
            }
        }
    }
    
    //shuffle the order of a deck's cards and return the edited deck
    public Deck shuffle(Deck d){
        Card temp = new Card(0,0);
        //step through the deck
        for (int i=0;i<deck.length;i++){
            //generate a random number
            Random randomGenerator = new Random();
            int randomIndex = randomGenerator.nextInt(deck.length);
            //swap the currently indexed card with the randomly indexed card
            temp.setNumber(d.deck[randomIndex].getNumber());
            temp.setSuit(d.deck[randomIndex].getSuit());
            d.deck[randomIndex].setNumber(d.deck[i].getNumber());
            d.deck[randomIndex].setSuit(d.deck[i].getSuit());
            d.deck[i].setNumber(temp.getNumber());
            d.deck[i].setSuit(temp.getSuit());
        }
        return d;
    }

    /*bubblesorts the given deck into ascending order and returns it*/
    public Deck sort(Deck d){
        int n = d.deck.length;
        for (int i=1; i<n; i++){
            for (int j=0;j<n-i;j++){
                //find the minimum value
                if (d.deck[j].getNumber()>d.deck[j+1].getNumber()){
                    //exchange elements
                    int temp = d.deck[j].getNumber();
                    d.deck[j].setNumber(d.deck[j+1].getNumber());
                    d.deck[j+1].setNumber(temp);
                }
            }
        }
        return d;
    }
    
    /*returns a string version of a deck's numbers only*/
    public String toNumbers(){
        String str = "";
        for (int i=0; i<deck.length; i++){
            str += deck[i].toNumber()+" ";
        }
        return str;
    }
    
    /*toString returns a string version of a deck*/
    public String toString(){
        String str = "";
        for (int i=0; i<deck.length; i++){
            str += deck[i].toString()+" ";
        }
        return str;
    }
    
    public static void main(String [] args){
    }
}