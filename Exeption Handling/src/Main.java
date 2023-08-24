import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception =  an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions
        // One way to handle exceptions is to surround dangerous code by a 'try/catch/finally' method
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("you cannot divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.  Please enter a whole number");
        } catch (Exception e) {
            System.out.println("Something went wrong, try again...");
        } finally {
            //System.out.println("This will always print");
            // a good use for the finally block is to close any open scanners or files that might still be open
            scanner.close();
        }
    }
}