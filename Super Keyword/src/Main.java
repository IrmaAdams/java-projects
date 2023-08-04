public class Main {
    public static void main(String[] args) {

        // super =  keyword refers to the superclass (parent) of an object
        //          very similar to the 'this' keyword
        //          'this' refers to this class that this keyword contains, and
        //          'super' refers to this object's parent class
        //          use the Super keyword to call a method in the parent class

        Person person = new Person("Batman", 32);
        Hero hero1 = new Hero("Batman", 32, "£££££");
        Hero hero2 = new Hero("Superman", 41, "Strength");

//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
//
//        System.out.println(hero2.name);
//        System.out.println(hero2.age);
//        System.out.println(hero2.power);

        System.out.println(hero2);

    }
}