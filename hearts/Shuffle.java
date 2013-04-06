/**
 * Shuffle reads a string version of a deck of cards from stdin, recreates the 
 * deck, shuffles the deck, and writes the string version to stdout
 */

package hearts;
import io.*;

public class Shuffle{
    public static void main(String [] args){
        String str = "";
        try{
            str=(IO.stdin.readLine());
        }
        catch (Exception e) {
            IO.stderr.println("Incorrect Deck format in hearts.Shuffle. Correct Format is NS NS NS");
        }
        Deck x = new Deck(str);
        x.shuffle(x);
        IO.stdout.println(x.toString());
    }
}