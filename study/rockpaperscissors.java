package study;
import java.util.Scanner;
import java.util.Random;

public class rockpaperscissors {

    public static void main(String[] args) {

        String[] objects = {"rock","paper","scissors"};
        String compchoice;
        String playchoice = "";
        String play = "Yea";
        int number;

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("* Welcome to rock/paper/scissors *");
        System.out.println("**********************************************");


        while(play == "yes"){
            if (playchoice.equals("out")){
                return;
            }
            System.out.print("Your choose: ");
            playchoice = scan.nextLine();
            number = rand.nextInt(0,3);
            if (number == 0 && playchoice.equals("scissors") || number == 0 && playchoice.equals("2")) {
                System.out.println("BOT Win!");
            }
            if (number == 1 && playchoice.equals("rock") || number == 1 && playchoice.equals("0")) {
                System.out.println("BOT Win!");
            }
            if (number == 2 && playchoice.equals("paper") || number == 2 && playchoice.equals("1")) {
                System.out.println("BOT Win!");
            }
            if (number == 0 && playchoice.equals("paper") || number == 0 && playchoice.equals("1")) {
                System.out.println("You Win!");
            }
            if (number == 1 && playchoice.equals("scissors") || number == 1 && playchoice.equals("2")) {
                System.out.println("You Win!");
            }
            if (number == 2 && playchoice.equals("rock") || number == 2 && playchoice.equals("0")) {
                System.out.println("You Win!");
            }
            if (number == 0 && playchoice.equals("rock") || number == 0 && playchoice.equals("0")) {
                System.out.println("Draw!");
            }
            if (number == 1 && playchoice.equals("paper") || number == 1 && playchoice.equals("1")) {
                System.out.println("Draw!");
            }
            if (number == 2 && playchoice.equals("scissors") || number == 2 && playchoice.equals("2")) {
                System.out.println("Draw!");
            }

        }
        System.out.println("****************");
        System.out.println("*   GL Dude!   *");
        System.out.println("****************");
        scan.close();
    }
}