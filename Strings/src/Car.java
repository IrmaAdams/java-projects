public class Car {
    String make = "Ford";
    String model = "Mustang";
    String colour = "Red";
    int year = 2022;

    // Override toString method to print a textual representation of car
    public String toString() {
        return make + "\n" + model + "\n" + colour + "\n" + year + "\n";
    }
}
