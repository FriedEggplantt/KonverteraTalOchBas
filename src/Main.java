import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String a = "";
            int firstBase = 0;
            int b = 0;
            String chosenBase = "";
            try {
                System.out.println("Input an integer: ");
                a = in.next();
                System.out.println("Input the base of your number (2-36): ");
                firstBase = in.nextInt();
                System.out.println("Input the base to convert your number to (2-36): ");
                b = in.nextInt();
                int base10 = Integer.parseInt(a, firstBase); //This converts the number to base 10
                chosenBase = Integer.toString(base10, b); //This converts the number to the chosen base
            }
            catch(Exception e){
                System.out.println("Invalid base!");
            }

            System.out.println("Your result: " + chosenBase);

            System.out.println("Do you want to try again? Yes/No");
            String answer = in.next();
            if (answer.equalsIgnoreCase("No")) {
                System.exit(0);
                break;
            }
        }
        }
    }

