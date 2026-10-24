package study;
import java.util.Scanner;
import java.util.Random;


public class javaslotmachine {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("**********************************");
        System.out.println("*    Вітаю у JavaSlotMachine!    *");
        System.out.println("*  Символи - 🏆 🫐 🍓 🍇 🍉 🍒. *");
        System.out.println("          Щасливої гри!           ");
        System.out.println("**********************************");

        while (balance > 0) {
            System.out.println("Наразі ваш баланс складає: $" + balance + ".");
            if (balance > 500000){
                System.out.println("Ти виграв, тварюка!");
                break;
            }
            System.out.println("Ваша ставка: ");
            bet = scan.nextInt();

            if (bet > balance) {
                System.out.println("На вашому балансі недостаньо коштів!");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Ви ввели неправильне число!");
                continue;
            }
            else{
                balance -= bet;
            }
            System.out.println("Крутиться...");
            row = spinrow();
            printrow(row);
            payout = getpayout(row, bet);

            if (payout > 0){
                System.out.println("Ти виграв: $"+ payout);
                balance += payout;
            }
            else{
                System.out.println("Ти нічого не виграв!");
            }
        }
        System.out.println("Йди бери кредит, сьогодні казино в 🍫🍫🍫!");
    }
    static String[] spinrow() {

        Random rand = new Random();

        String[] simbols = {"🏆","🍒","🍉","🍓","🍇","🫐"};
        String[] row = new String[3];

        for (int i = 0; i < 3; i++) {
            row[i] =  simbols[rand.nextInt(simbols.length)];
        }

        return row;
    }
    static void printrow(String[] row){
        System.out.println("_______________");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("_______________");
    }
    static int getpayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 5;
                case "🍉" -> bet * 5;
                case "🍓" -> bet * 5;
                case "🍇" -> bet * 5;
                case "🫐" -> bet * 10;
                case "🏆" -> bet * 50;
                default -> bet * 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 3;
                case "🍓" -> bet * 3;
                case "🍇" -> bet * 3;
                case "🫐" -> bet * 7;
                case "🏆" -> bet * 10;
                default -> bet * 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 3;
                case "🍓" -> bet * 3;
                case "🍇" -> bet * 3;
                case "🫐" -> bet * 7;
                case "🏆" -> bet * 10;
                default -> bet * 0;
            };
        }
        else if (row[0].equals(row[2])) {
            return switch (row[2]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 3;
                case "🍓" -> bet * 3;
                case "🍇" -> bet * 3;
                case "🫐" -> bet * 7;
                case "🏆" -> bet * 10;
                default -> bet * 0;
            };
        }
        return 0;
    }
}
