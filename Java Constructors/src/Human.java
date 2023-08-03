public class Human {

    // Fields
    String name;
    int age;
    double weight;

    // Constructor
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Methods
    void eat(){
        System.out.println(this.name+" is eating.");
    }
    void sleep(){
        System.out.println(this.name+" is sleeping.");
    }
}
