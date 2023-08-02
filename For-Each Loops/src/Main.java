import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // For-Each loop    =   also known as an enhanced for loop
        //                  =   traversing technique to iterate through the elements in an array/collection
        //                  =   takes fewer steps, more readable
        //                  =   less flexible

        // use For-each loop using an array
        String[] animals = {"Cat", "Dog", "Crow", "Hamster"};
        for(String i : animals){        // for every String index(i) in(:) our array of animals
                                        // this will iterate once for each index of our array of animals
            System.out.println(i);
        }

        System.out.println();

        // use For-each loop using a collection
        ArrayList<String> petsList = new ArrayList<String>();
        petsList.add("Kitten");
        petsList.add("Puppy");
        petsList.add("Gold fish");
        for(String i : petsList){
            System.out.println(i);
        }

    }
}