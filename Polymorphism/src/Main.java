public class Main {
    public static void main(String[] args) {

        // poymorphism =    greek word for poly - "many", and morph - "form"
        //                  The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        // you could call the methods like this:
//        car.go();
//        bicycle.go();
//        boat.go();

        // this is a better way to call the methods:
        // create an enhanced for loop to iterate through all elements of the array

        for(Vehicle x : racers){
            x.go();
        }


    }
}