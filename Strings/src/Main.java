public class Main {
    public static void main(String[] args) {

        String name = "MyName";
        //System.out.println(name);

        // equals method
//        boolean result = name.equals("My Name");
//        System.out.println(result);

        // length method
//        int result = name.length();
//        System.out.println(result);

        // char at method
//        char result = name.charAt(0);
//        System.out.println(result);

        // index of method
//        int result = name.indexOf("N");
//        System.out.println(result);

        // is empty method
//        boolean result = name.isEmpty();
//        System.out.println(result);

        // to upper case method
//        String result = name.toUpperCase();
//        System.out.println(result);

        // to lower case method
//        String result = name.toLowerCase();
//        System.out.println(result);

        // trim method
//        String newName = "   MyNewName   ";
//        System.out.println("." + newName + ".");
//        String result = newName.trim();
//        System.out.println("." + result + ".");

        // replace method
//        String result = name.replace('y', '*');
//        System.out.println(result);

        // ToString method

        // toString()   =   special method that all objects inherit (from the Object Super class)
        //                  that returns a string that "textually represents" an object.
        //                  It can be used both implicitly and explicitly

        Car car = new Car();

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.colour);
//        System.out.println(car.year);
//        System.out.println();

        // output address of car object in memory
//        System.out.println(car);                    // calling toString() method implicitly
//        System.out.println(car.toString());         // calling toString() method explicitly

        // Override toString method to print a textual representation of car
        car.toString();                             // output actual representation of car object




    }
}