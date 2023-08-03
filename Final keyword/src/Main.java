public class Main {
    public static void main(String[] args) {

        // anything that is declared 'final' cannot be changed or updated later in your program

        double pi = 3.14159;
        pi = 4;
        System.out.println(pi);

        final double PI = 3.14159;  // good practice to use all caps when declaring a final variable
        // PI = 4;                  // error:  cannot assign a value to final variable PI
        System.out.println(PI);

    }
}