public class Main {
    public static void main(String[] args) {

        // method chaining =    a common syntax for invoking multiple method calls in OOP
        //                      it is useful for condensing code into fewer lines


        // 3 lines of code:
        String s1 = "   Hello ";

        s1 = s1.concat("World!   ");
        s1 = s1.toUpperCase();
        s1 = s1.trim();

        System.out.println(s1);

        
        // 1 line of code:
        String s2 = "   Hello ";

        s2 = s2.concat("World!   ").toUpperCase().trim();

        System.out.println(s2);

    }
}