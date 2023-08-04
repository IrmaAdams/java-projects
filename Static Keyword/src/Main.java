public class Main {
    public static void main(String[] args) {

        // static = modifier.  A single copy of a member (variable/method) is created and is shared by all objects of that class
        //          The class "owns" the static member.

        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Sue");
        Friend friend3 = new Friend("Mary");

        System.out.println(Friend.numberOfFriends);         // class Friend owns the static variable called numberOfFriends
        Friend.displayFriends();                            // class Friend owns the static method called displayFriends

    }
}