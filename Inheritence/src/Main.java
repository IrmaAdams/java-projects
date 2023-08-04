public class Main {
    public static void main(String[] args) {

        // inheritance =    the process where one class acquires the attributes and methods of another.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        System.out.println(car.wheels);
        System.out.println(bicycle.wheels);

    }
}