public class Main {
    public static void main(String[] args) {

        // a method is a block of code that is executed whenever it is called upon
        // create methods outside the main method, call/invoke method inside main method or
        // when you invoke a method inside of it itself, it is called Recursion
        // naming conventions for methods - first letter lowercase
        // methods can have parameters, and when it is passed to the method it is called arguments

        String name = "Bob";
        hello(name);
        hello("Sue");
    }
    static void hello(String name) {
        System.out.println("Hello" + " " + name + "!");
        //hello();                        // Recursion - this will create a stack overflow because the method does not have an exit condition.
    }

}