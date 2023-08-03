import java.util.Random;

public class DiceRoller {
    // fields
    Random random;
    int number;
    // constructor
    DiceRoller(){
        random = new Random();
        rollDice(random, number);

    }
    // methods
    void rollDice(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
