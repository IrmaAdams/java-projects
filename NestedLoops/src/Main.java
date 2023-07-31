import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Nested Loops

        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
        String symbol = "";

        // PRINT A BLOCK OF SYMBOLS
//        System.out.println("Enter number of Rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter number of Columns: ");
//        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();
//
//        for(int i = 0; i <= rows; i++){               // (outer loop) row
//            System.out.println();                     // (outer loop) print number of rows
//            for(int j = 1; j <= columns; j++){        // (inner loop) column
//                System.out.print(symbol);             // (inner loop) print symbol on same line
//            }

        // INCREASING NR PER LINE
//        for(int i=1; i <= 10; i++){                   // (outer loop) row
//            System.out.println();                     // (outer loop) print number of rows
//            for(int j=1; j <= i; j++){                // (inner loop) column
//                System.out.print("*");                // (inner loop) print symbol on same line
//            }


        // PYRAMID - 5 rows
        for (int row = 1; row <= 5; row++) {            // (outer loop) 5 rows - i = row number
            System.out.println();                       // (outer loop) print 5 lines/rows
            for (int space = 1; space <= 5 - row; space++) { // space for loop - s = number of spaces
                System.out.print(" ");                  // print single space on the same line
            }
            for (int j = 1; j <= row * 2 - 1; j++){     // j (symbol) - used j, not symbol, because parameters accept int not string
                System.out.print(symbol);               // print symbol on the same line (print, not println)
            }

        }


    }
}