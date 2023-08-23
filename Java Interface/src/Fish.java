public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("The Shark is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The Sardines are fleeing");
    }
}
