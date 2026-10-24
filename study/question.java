package study;
import java.util.Scanner;

public class question {

    public static void main(String[] args) {

        String[] questions = {"1",
                "2",
                "3",
                "4",
                "5"};

        String[][] options = {{"1","2","3","4","5"},
                {"1","2","3","4","5"},
                {"1","2","3","4","5"},
                {"1","2","3","4","5"},
                {"1","2","3","4","5"}};

        int[] answers = {1, 1, 1, 1, 1};
        int score = 0;
        int guess;

        Scanner scan = new Scanner(System.in);

        System.out.println("**********************************************************************************");
        System.out.println("*                                                                                *");
        System.out.println("**********************************************************************************");

        for (int i=0; i< questions.length; i++) {
            System.out.println(questions[i]);
            for (int j=0; j< options.length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print(":");
            guess = scan.nextInt();
            if (guess == answers[i]) {
                score++;
            }
        }
        System.out.print("" + score + "");




        scan.close();
    }
}
