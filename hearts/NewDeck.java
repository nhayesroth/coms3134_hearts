/**
 * NewDeck produces a deck of 52 cards and prints a string version
 * of it onto stdout
 */

package hearts;
import io.*;

public class NewDeck{
    public static void main(String [] args){
        Deck x = new Deck();
        IO.stdout.println(x.toString());
    }
}