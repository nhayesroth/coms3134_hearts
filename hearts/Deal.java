/**
 * Deal reads a string version of a deck of cards from stdin, 
 * recreates the deck, and writes 4 separate 13-card decks (hands) 
 * in their string versions to stdout
 */

package hearts;
import io.*;

public class Deal{
    public static void main(String [] args){
        String str = "";
        try{
            str=(IO.stdin.readLine());
        }
        catch (Exception e) {
            IO.stderr.println("Incorrect Deck format in hearts.Deal. Correct Format is NS NS NS");
        }
        //create a deck from stdin
        Deck full = new Deck(str);
        //create 4 separate decks
        int size=full.deck.length/4;
        Deck north = new Deck(size);
        Deck east = new Deck(size);
        Deck south = new Deck(size);
        Deck west = new Deck(size);
        for (int i=0;i<north.deck.length;i++){
            north.deck[i]=full.deck[4*i];
            east.deck[i]=full.deck[1+4*i];
            south.deck[i]=full.deck[2+4*i];
            west.deck[i]=full.deck[3+4*i];
        }
        //print the decks to stdout
        IO.stdout.println(north.toString()+ east.toString()+
                          south.toString()+ west.toString());
    }
}