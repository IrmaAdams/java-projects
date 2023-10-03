
enum Planets {
    // listing constants, all letters uppercase
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    int number;
    Planets(int number){
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {

        // enum =   enumerated (ordered listing of items in a collection)
        //          grouping of constants that behave similarly to objects

        // In Java when you create enums, they are constants.  They cannot be changed
        // It is a listing of constants that behave similarly to objects.
        // There are 2 ways to create enums.  They are created similarly to classes
        // 1st way:  outside the main class
        // 2nd way:  or create a new enum (file - new - enum)


        Planets myPlanet = Planets.EARTH;

        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planets myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here!");
                System.out.println("This is planet nr. "+myPlanet.number);
                break;
            default:
                System.out.println("You cannot live here!");
                System.out.println("This is planet nr. "+myPlanet.number);
                break;

        }
    }
}