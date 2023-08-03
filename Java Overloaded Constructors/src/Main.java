public class Main {
    public static void main(String[] args) {

        // overloaded constructors =    multiple constructors within a class with the same name,
        //                              but have different parameters
        //                              name + parameters = signature

        Pizza cheesePizza = new Pizza("Thin crust", "tomato", "mozzarella");
        Pizza hawaiinPizza = new Pizza("Thin crust", "tomato", "mozzarella", "Pineapple");

        System.out.println("Here are these ingredients for your pizza: ");
        System.out.println(cheesePizza.bread);
        System.out.println(cheesePizza.sauce);
        System.out.println(cheesePizza.cheese);
        System.out.println();

        System.out.println("Here are these ingredients for your pizza: ");
        System.out.println(hawaiinPizza.bread);
        System.out.println(hawaiinPizza.sauce);
        System.out.println(hawaiinPizza.cheese);
        System.out.println(hawaiinPizza.topping);

    }
}