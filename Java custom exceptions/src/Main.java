import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exception =  an event, after execution, that disrupts the normal flow of a program
        // ex. ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException

        // user defined exceptions = custom exceptions
        // ex. DuplicateEmail, InvalidCreditException, AgeException

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        }
        catch (Exception e){
            System.out.println("A problem occurred: " +e);
        }
    }

    private static void checkAge(int age)throws AgeException {
        if(age<18){
            throw new AgeException("You are not old enough!  You must be 18 or older to sign up");
        }else{
            System.out.println("You are now signed up!");
        }
    }


}