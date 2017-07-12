import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main (String[] args)

    {
        System.out.println("Let's get factorial!");
        String contin;
        do {
            Scanner scan = new Scanner(System.in);
            int userNum = 0;
            int userNumClone;
            long factorial;
            System.out.println(" ");
            System.out.println("Please enter a whole number between 1 and 10: ");
            System.out.println(" ");
            userNum = scan.nextInt();
            int factorialDigit = userNum;
            userNumClone = userNum;
            System.out.println(" ");
                do {
                    factorialDigit = factorialDigit - 1;
                    userNum *= factorialDigit;
                    }
                while (factorialDigit > 1);
            factorial = 0 + userNum;
            System.out.println("The factorial of " + userNumClone + " is " + factorial);
            System.out.println(" ");
            System.out.println("Do you want to continue?\t Y/N: ");
            System.out.println(" ");
            contin = scan.next();
            System.out.println(" ");
        } while (contin.contains("Y") || contin.contains("y"));
        System.out.println("Factorials are tight!\tThanks for playing!");
    }
}
