public class Main {
    public static void main(String[] args) {

        // abstract =   abstract classes cannot be instantiated, but they can have a subclass
        //              abstract methods are declared without an implementation

        Car car = new Car();
        Truck truck = new Truck();

        // adding the abstract modifier to the Vehicle class prevents you from creating and instance of the Vehicle class
//        Vehicle vehicle = new Vehicle();

        car.go();
        truck.go();

    }
}