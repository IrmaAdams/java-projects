public class Main {
    public static void main(String[] args) {

        // interface =  a template that can be applied to a class.
        //              similar to inheritance, but specifies what a class has to, or must do.
        //              classes can apply more than one interface, inheritance is limited to 1 super
        //              you do not need to declare a method body in the interface class, but you need to
        //              the class using the method needs to define what the method will do

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish shark = new Fish();
        Fish sardines = new Fish();

        shark.hunt();
        sardines.flee();

    }
}