import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class list6_1 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");

        try {
            File file = new File("newFile.txt");
            if (file.createNewFile()) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }

            String data = "This is the data in the new file.";
            FileWriter writer = new FileWriter("newFile.txt");
            writer.write(data);
            System.out.println("Data is written to the file.");
            writer.close();

            FileReader reader = new FileReader("newFile.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}