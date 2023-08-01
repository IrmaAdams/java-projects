public class Main {
    public static void main(String[] args) {

        // initialize array
//        String[] artists = {"Van Gogh", "Monet", "Vermeer", "Degas"};
//        artists[0] = "Renoir";
//        System.out.println(artists[0]);
//        System.out.println(artists[3]);

        // create an array allocating size first and assigning values later
//        String[] artist = new String[3];
//        artist[0]="Van Gogh";
//        artist[1]="Degas";
//        artist[2]="Monet";
        //System.out.println(artist[0]);

        // using a for loop to iterate through all elements of an array
//        for(int i=0;i< artist.length;i++){
//            System.out.println(artist[i]);
//        }

        // 2D ARRAYS
        // declare 2d array
//        String[][] fruit = new String[2][3];        // 2 rows, 3 columns
//        fruit[0][0] = "Apple";
//        fruit[0][1] = "Pineapple";
//        fruit[0][2] = "Grapes";
//        fruit[1][0] = "Apricot";
//        fruit[1][1] = "Kiwi";
//        fruit[1][2] = "Mango";

        // or initialize a 2D array
        String[][] fruit =  {
                                {"Apple", "Pineapple", "Grapes"},       // Row 0
                                {"Apricot", "Kiwi", "Mango"}            // Row 1
                            };

        System.out.println(fruit[0][1]);

        for (int i = 0; i < fruit.length; i++) {
            System.out.println();
            for (int j = 0; j < fruit[i].length; j++) {     // fruit[i].length = take the length of the first row and continue...
                // ...the counter (index of j) as long as it's less than the current row
                System.out.print(fruit[i][j] + " ");

            }
        }


    }
}