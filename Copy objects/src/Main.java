public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Chevrolet", "Camaro", 2021);
//        Car car2 = new Car("Ford", "Mustang", 2020);
//        car2.copy(car1);                  // car copy method
        Car car2 = new Car(car1);           // or you need to create an overloaded constructor for Car to pass in object to copy

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();

        //car2 = car1;        // this will only make both objects the same object, stored in the same address, but you gave this object 2 different names

    }
}