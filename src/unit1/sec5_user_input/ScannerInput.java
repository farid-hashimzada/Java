package unit1.sec5_user_input;
import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        int age = 27;
        double statueInternetConnection = 14.72;
        boolean hasInternetConnection = false;
//        String userInput = "\u005A";
//        String name = "Jeff";
//        Scanner scanner = new Scanner(System.in);
//        String input =  scanner.next();
//        System.out.printf(input);
        userInput();
    }

    private static void userInput() {
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.println(userInput + " is a nice name");

        System.out.println("How old are you");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userInput + " and your age " + userAge);
        System.out.println("\n how tall are you in metres");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight);

    }

    private static void StringFormatter() {
        System.out.format("i have %.3f cats, %d dogs, and 1 %s.", 7.9, 2, "panther");
        System.out.format("i have %.3f cats, %d dogs, and 1 %s.", 7.9, 2, "panther");
    }
}