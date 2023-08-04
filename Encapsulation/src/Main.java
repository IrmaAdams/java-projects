public class Main {
    public static void main(String[] args) {

        // Encapsulation =  attributes of a class will be hidden or private,
        //                  Can be accessed only through methods (getters and setters)
        //                  You should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Jetta", "City", 2005);

        // attempt to access car.make = error - field car.make is not visible
        //System.out.println(car.make);         // need to create getters in Car class

        System.out.println(car.getMake());

        // attempt to change car.make = error - make has private access in 'Car'
        //car.make = "Sport";                   // need to create setters in Car class

        car.setMake("Sport");
        System.out.println(car.getMake());
    }
}