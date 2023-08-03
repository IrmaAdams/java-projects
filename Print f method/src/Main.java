public class Main {
    public static void main(String[] args) {

        // printf() =   an optional method to control, format, and display text to the console window
        //              two arguments = format string + (object/variable/value)
        //              % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Kitty";
        int myInt = 12345;
        double myDouble = 3.14159;

        // [conversion-character]
        System.out.printf("%b", myBoolean);     // b = boolean
        System.out.println();
        System.out.printf("%c", myChar);        // c = characters
        System.out.println();
        System.out.printf("%s", myString);      // s = string
        System.out.println();
        System.out.printf("%d", myInt);         // d = decimal values (int, short, long, byte)
        System.out.println();
        System.out.printf("%f", myDouble);      // f = floating point numbers (float, double)
        System.out.println("\n");

        // [width]
        // sets the minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString);      // text will be right justified
        System.out.println();
        System.out.printf("Hello %-10s", myString);     // text will be left justified
        System.out.println("\n");

        // [precision]
        // sets the number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f ", myDouble);
        System.out.println("\n");

        // [flags]
        // add an effect to output based on the flag added to format specifier:
        // - :  left justify
        // + :  output a plus (+) or minus (-) sign for a numeric value
        // 0 :  numeric values are zero-padded
        // , :  comma grouping separator if number > 1000

        System.out.printf("You have this much money %-20f ", myDouble);         // left justified
        System.out.println();
        System.out.printf("You have this much money %20f ", myDouble);          // right justified
        System.out.println();
        System.out.printf("You have this much money %+f ", myDouble);           // add a + sign (- sign is automatically added with negative numbers)
        System.out.println();
        System.out.printf("You have this much money %020f ", myDouble);         // pad with 0's
        System.out.println();
        System.out.printf("You have this much money %,d ", myInt);              // group numbers when > 1000
        System.out.println();


    }
}