import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // use the class - File writer class

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("First line of poem\n");
            writer.write("Second line of poem\n");
            writer.write("Third line of poem\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}