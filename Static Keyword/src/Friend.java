public class Friend {

    String name;
    static int numberOfFriends;     // static variable

    Friend(String name) {
        this.name = name;
        numberOfFriends++;          // add 1 to the number of friends after creating a friend object
    }

    static void displayFriends() {   // static method
        System.out.println("You have " + numberOfFriends + " friends.");
    }

}
