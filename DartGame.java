import java.util.Scanner;

public class DartGame {
    private static double x, y;
    private static int p1 = 0 , p2 = 0;
    static Scanner s = new Scanner(System.in);

    /**
     * Allows user input and calucates the score to determine the winner
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public DartGame(double x, double y){
            p1 = 0;
            p2 = 0;
            for(int i = 0; i < 12; i++){
                if(i < 3){
                    System.out.println("Player One: Enter 2 Coordinates");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    p1 += Darts.score(x,y);
                }
                if(i >=3 && i < 6){
                    System.out.println("Player Two: Enter 2 Coordinates");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    p2 += Darts.score(x,y);
                }
            }
            System.out.println("SCORE: " +  p1 + " to " + p2 + " " + outcome());
//            System.exit(0);
    }

    /**
     * Determines the winner for the game if any
     * @return
     */
    public static String outcome(){
        if(p1 > p2){
            return "\tPlayer One wins!";
        } else if(p1 < p2){
            return "\tPlayer Two wins!";
        } else{
            return "\tIt's a tie!";
        }
    }

    public static void run(){
        boolean finish = false;
        while(!finish) {
            switch(s.next().toUpperCase()) {
                case "Y":
                    new DartGame(x,y);
                    break;
                case "N":
                    finish = true;
                    System.exit(0);
                default:
                    System.err.println("Invalid Input");
            }
            System.out.println("Continue? (Enter Y/N)");
        }
    }

}
