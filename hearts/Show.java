/**
 * Show reads 4 hands from stdin and pretty-prints them to stdout
 */

package hearts;
import io.*;

public class Show{
    public static void main(String [] args){
        String str = "";
        try{
            str=(IO.stdin.readLine());
        }
        catch (Exception e) {
            IO.stderr.println("You broke hearts.Show.");
        }
        /*separate 4 decks*/
        //create a deck from stdin
        Deck full = new Deck(str);
        //create 4 separate decks
        int size=full.deck.length/4;
        Deck north = new Deck(size);
        Deck east = new Deck(size);
        Deck south = new Deck(size);
        Deck west = new Deck(size);
        for (int i=0;i<size;i++){
            north.deck[i]=full.deck[i];
            east.deck[i]=full.deck[size+i];
            south.deck[i]=full.deck[2*size+i];
            west.deck[i]=full.deck[3*size+i];
        }
        /*split into 4x4 suited decks*/
        //north
        Deck north0 = new Deck(0,north);
        Deck north1 = new Deck(1,north);
        Deck north2 = new Deck(2,north);
        Deck north3 = new Deck(3,north);
        //east
        Deck east0 = new Deck(0,east);
        Deck east1 = new Deck(1,east);
        Deck east2 = new Deck(2,east);
        Deck east3 = new Deck(3,east);
        //south
        Deck south0 = new Deck(0,south);
        Deck south1 = new Deck(1,south);
        Deck south2 = new Deck(2,south);
        Deck south3 = new Deck(3,south);
        //west
        Deck west0 = new Deck(0,west);
        Deck west1 = new Deck(1,west);
        Deck west2 = new Deck(2,west);
        Deck west3 = new Deck(3,west);
        /*sort suited decks into ascending order*/
        //north
        north0.sort(north0);
        north1.sort(north1);
        north2.sort(north2);
        north3.sort(north3);
        //east
        east0.sort(east0);
        east1.sort(east1);
        east2.sort(east2);
        east3.sort(east3);
        //south
        south0.sort(south0);
        south1.sort(south1);
        south2.sort(south2);
        south3.sort(south3);
        //west
        west0.sort(west0);
        west1.sort(west1);
        west2.sort(west2);
        west3.sort(west3);
        /*print to stdout in a nice way*/
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "North", "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "C: " + north0.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "D: " + north1.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "H: " + north2.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "S: " + north3.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "West", "", "East");
        IO.stdout.printf("%-20s %-20s %-20s\n", "C: " + west0.toNumbers(), "", "C: " + east0.toNumbers());
        IO.stdout.printf("%-20s %-20s %-20s\n", "D: " + west1.toNumbers(), "", "D: " + east1.toNumbers());
        IO.stdout.printf("%-20s %-20s %-20s\n", "H: " + west2.toNumbers(), "", "H: " + east2.toNumbers());
        IO.stdout.printf("%-20s %-20s %-20s\n", "S: " + west3.toNumbers(), "", "S: " + east3.toNumbers());
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "South", "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "C: " + south0.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "D: " + south1.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "H: " + south2.toNumbers(), "");
        IO.stdout.printf("%-20s %-20s %-20s\n", "", "S: " + south3.toNumbers(), "");
    }
}