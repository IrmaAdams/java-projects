public class Main {
    public static void main(String[] args) {

        // initialize array
//        String[] artists = {"Van Gogh", "Monet", "Vermeer", "Degas"};
//        artists[0] = "Renoir";
//        System.out.println(artists[0]);
//        System.out.println(artists[3]);

        // create an array allocating size first and assigning values later
        String[] artist = new String[3];
        artist[0]="Van Gogh";
        artist[1]="Degas";
        artist[2]="Monet";
        //System.out.println(artist[0]);

        // using a for loop to iterate through all elements of an array
        for(int i=0;i< artist.length;i++){
            System.out.println(artist[i]);
        }

    }
}