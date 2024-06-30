import java.util.Scanner;

public class Task_1 {

    // ANSI escape codes for colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("**************************************************************************************");
        System.out.println(ANSI_CYAN + "                 ***  Hello Everyone, I'm Nishant  ***" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "***************** Welcome to my Number Guessing Game ***************************" + ANSI_RESET);
        System.out.println("**************************************************************************************");
        System.out.println("Enter the Minimum Value:");
        int min = obj.nextInt();
        System.out.println("Enter the Maximum Value:");
        int max = obj.nextInt();
        int r = (int) ((max - min + 1) * Math.random() + min);
        int count = 0;
        boolean correct = false;
        System.out.println("----------------------------------------------------------------------------------------");
        while (!correct) {
            System.out.println("Enter Your Guess Number between " + min + " to " + max);
            int guess = obj.nextInt();
            System.out.println("----------------------------------------------------------------------------------------");
            count++;
            if (guess > r) {
                System.out.println(ANSI_RED + "Your Guess is too Long , Again guess the number please.." + ANSI_RESET);
                System.out.println("----------------------------------------------------------------------------------------");
            } else if (guess == r) {
                correct = true;
                System.out.println("**************************************************************************************");
                System.out.println(ANSI_YELLOW + "!Congratulations , You Guess the Number " + r + " in " + count + " Attempts.." + ANSI_RESET);
                System.out.println("**************************************************************************************");
            } else if (guess < r) {
                System.out.println(ANSI_RED + "Your Guess is too Short , Again Guess the number please.." + ANSI_RESET);
                System.out.println("----------------------------------------------------------------------------------------");
            }
        }
        if (count <= 7) {
            System.out.println(ANSI_YELLOW + "You are the Winner of this Number guessing Game , Thank You!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "You have applied too many Attempts!!!! , You Lose the Match.. Again Play the game.." + ANSI_RESET);
        }
        System.out.println("**************************************************************************************");
        obj.close();

    }
}
