/*
 * Card defines a class of objects that represent individual playing cards.
 * The program includes a single constructor as well as a number of methods,
 * including getters, setters, and two toString methods.
 */

package hearts;
import io.*;

public class Card{
    public int number;
    public int suit;
    
    private String[] numbers = {"A", "2", "3", "4", "5","6", 
        "7", "8", "9", "T", "J", "Q", "K"};
    private String[] suits = {"C", "D", "H", "S"};

    //constructor
    public Card(int n, int s){
        number=n;
        suit=s;
    }

    //methods
    public void setNumber(int n){
        number=n;
    }
    public void setSuit(int s){
        suit=s;
    }
    public int getNumber(){
        return number;
    }
    public int getSuit(){
        return suit;
    }
    public String toString(){
        return numbers[number] + suits[suit];
    }
    
    public String toNumber(){
        return numbers[number];
    }
    
    //creates a card from a string representation
    public Card(String pair){
        int x = 0;
        int y = 0;
        String num = pair.substring(0,1);
        String sui = pair.substring(1);
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i].equals(num)) x = i;
        }
        for (int j = 0; j < suits.length; j++){
            if (suits[j].equals(sui)) y = j;
        }
        number = x;
        suit = y;
    }
    
    public static void main(String [] args){
    }
}