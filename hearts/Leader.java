/**
 * Leader reads 4 hands from stdin (North, East, South, and West) 
 * and writes which hand contains the 2 of clubs to stdout
 */

package hearts;
import io.*;

public class Leader{
    public static void main(String [] args){
        String str = "";
        try{
            str=(IO.stdin.readLine());
        }
        catch (Exception e) {
            IO.stderr.println("Leader couldn't be found.");
        }
        int index = 650;
        for (int i=0;i<str.length()-1;i=i+3){
            if (str.substring(i,i+2).equals("2C")){
                index = i;
            }
        }
        if (index == 650){
            IO.stdout.println("Looks like the deck is missing a 2 of Clubs...");
        }
        else if (index<str.length()/4){
            IO.stdout.println("North");
        }
        else if (index<str.length()/2){
            IO.stdout.println("East");
        }
        else if (index<3*str.length()/4){
            IO.stdout.println("South");
        }
        else if (index<str.length()){
            IO.stdout.println("West");
        }
    }
}