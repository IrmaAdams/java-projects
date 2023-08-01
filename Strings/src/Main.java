public class Main {
    public static void main(String[] args) {

        String name = "MyName";
        System.out.println(name);

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
        String result = name.replace('y', '*');
        System.out.println(result);
    }
}