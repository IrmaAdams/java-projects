public class Dog extends Animal{

    // this is the overriding method - good practice to add @override:
    @Override
    void speak(){
        System.out.println("The dog goes Bark!");
    }
}
