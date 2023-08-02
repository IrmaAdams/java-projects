import java.util.*;
public class Main {
    public static void main(String[] args) {

        // 2D array lists = a dynamic list of lists
        // You can change the size of these lists during runtime

        // create a 2d array list to contain all array lists

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Muffins");
        bakeryList.add("Seed Loaf");
        bakeryList.add("Garlic Bread");

        ArrayList<String> dairyList = new ArrayList();
        dairyList.add("Yoghurt");
        dairyList.add("Milk");
        dairyList.add("Double Cream");

        ArrayList<String> petFoodList = new ArrayList();
        petFoodList.add("Cat Dry Food");
        petFoodList.add("Cat Snacks");

        groceryList.add(bakeryList);
        groceryList.add(dairyList);
        groceryList.add(petFoodList);

        System.out.println(bakeryList);         // print list
        System.out.println(bakeryList.get(0));  // print item at index 0
        System.out.println(dairyList);
        System.out.println(dairyList.get(2));
        System.out.println(petFoodList);
        System.out.println(petFoodList.get(1));
        System.out.println(groceryList);                // print list of lists
        System.out.println(groceryList.get(1));         // print list at index 1
        System.out.println(groceryList.get(1).get(0));  // print item at index 0 of list at index 1

    }
}