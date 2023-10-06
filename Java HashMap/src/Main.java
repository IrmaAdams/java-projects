import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayLists, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // example:  (name, email), (username, userID), (country, capital)

        // to create a HashMap:
        HashMap<String, String> countries = new HashMap<String, String>();

        // add a key and value:
        countries.put("UK", "London");
        countries.put("USA", "Washington");
        countries.put("South Africa", "Cape Town");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");

        System.out.println(countries);

        // display the size of the HashMap:
        System.out.println(countries.size());

        // replace a value for a specific key:
        countries.replace("USA", "Detroit");
        System.out.println(countries);

        // to remove keys and values from HashMap:
        countries.remove("USA");
        System.out.println(countries);

        // get a value from one of the keys:
        System.out.println(countries.get("Russia"));

        // to see if a specific key is within HashMap:
        System.out.println(countries.containsKey("UK"));

        // to see if a specific value is within HashMap:
        System.out.println(countries.containsKey("Manchester"));

        // to display all the key/value pairs within a HashMap:
        for(String i : countries.keySet()){
            System.out.print(i+" "+"= ");
            System.out.println(countries.get(i));
        }

        // to clear everything:
        countries.clear();
        System.out.println(countries);
    }
}