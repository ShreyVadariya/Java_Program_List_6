import java.io.FileWriter;
import java.io.IOException;

public class list6_4 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");

        try {
            FileWriter writer = new FileWriter("myFile.txt");
            String data = "Hello World!\njava.";
            writer.write(data);
            System.out.println("Data is written to the file.");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}