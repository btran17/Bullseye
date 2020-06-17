import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/** Name: Brittney Tran
 * Date: 12/2/2019
 * Class: CSC 1120
 * Pledge: I have neither given nor received unauthorized aid on this program.
 * Description: Bullseye is a program that allows users to play darts based on coordinates.
 * Input: The user types in 3 numbers.
 * Output: The program will display the winner after several rounds of play.
 */

public class Darts {
    private static double x, y;
    private static int p1 = 0 , p2 = 0;
    static Scanner s = new Scanner(System.in);

    /**
     * Reads the coordinates from the file while seperating first and second player
     * Increments the score with each scan and determines the winner
     * @param file Name of the file
     * @throws FileNotFoundException
     */
    public Darts(String file) throws FileNotFoundException{
//        file = "C:\\Users\\LotusCake\\IdeaProjects\\Bullseye\\src\\coordinates.txt";
//        file = "C:\\Users\\Bibi\\IdeaProjects\\Bullseye\\src\\coordinates.txt";
        Scanner scan = new Scanner(new File(file));
        while(scan.hasNextLine()){
            p1 = 0;
            p2 = 0;
            for(int i = 0; i < file.length(); i++){
                //player one
                if(i< 3){
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    p1 += score(x,y);
                }
                //player two
                if(i >=3 && i < 6){
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    p2 += score(x,y);
                }
            }
                System.out.println("SCORE: " +  p1 + " to " + p2 + " " + result());
        }
    }

    /**
     * Calculates the radius in which the dart lands
     * @param x x coordinate
     * @param y y coordinate
     * @return returns a double of the radius
     */
    public static double radius(double x, double y){
        return Math.sqrt(x*x + y*y);
    }

    /**
     * Calculates the score in which region the dart landed
     * @param x the x coordinate
     * @param y the y coordinate
     * @return returns an int of the score
     */
    public static int score(double x, double y){
        double r = radius(x,y);
        int s = 0;
        if(r < 4){
            s = 100;
        } else if(r < 8){
            s = 80;
        } else if(r < 12){
            s = 60;
        } else if(r < 16){
            s = 40;
        } else if(r < 20){
            s = 20;
        }
        return s;
    }

    /**
     * Determine who wins the game
     * @return returns the winner, if any
     */
    public static String result(){
        if(p1 > p2){
            return "\tPlayer One wins!";
        } else if(p1 < p2){
            return "\tPlayer Two wins!";
        } else{
            return "\tIt's a tie!";
        }
    }

    /**
     * Driver Class
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        try {
            System.out.print("Enter the name of the file: ");
            String filename = s.nextLine();
            Darts d = new Darts(filename);
        } catch(Exception e){
            System.err.println("File has an error.");
        }
        System.out.println("Continue? (Enter Y/N)");
        DartGame.run();
    }
}
