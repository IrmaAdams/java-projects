public class Main {
    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // example:  (sculpture, water bottle, speaker, coaster)

        Car myCar = new Car();
        System.out.println(myCar.colour);
        System.out.printf("£ %,.2f", myCar.price);

        myCar.brake();

        Car mySecondCar = new Car();

    }
}