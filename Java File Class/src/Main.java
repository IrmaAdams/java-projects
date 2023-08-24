import java.io.File;

public class Main {
    public static void main(String[] args) {

        // file =   An abstract representation of file and directory path names

        File file = new File("Test Text Document");

        if(file.exists()){
            System.out.println("This file exists!");
        }else{
            System.out.println("This file does not exist!");
        }

    }
}