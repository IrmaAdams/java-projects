public class Main {
    public static void main(String[] args) {

        // pass objects as arguments to a method

        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Folkswagen Beatle");

        garage.park(car1);
        garage.park(car2);

    }
}