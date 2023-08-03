public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("John", 17, 65.0);
        Human human2 = new Human("Sue", 19, 62.0);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.sleep();

    }
}