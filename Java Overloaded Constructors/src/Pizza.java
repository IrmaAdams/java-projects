public class Pizza {
    // Fields
    String bread;
    String sauce;
    String cheese;
    String topping;

    // Constructors
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
        Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
        Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    // Methods
}
