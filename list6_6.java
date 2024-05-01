import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class list6_6 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");

        try {
            FileWriter fileWriter = new FileWriter("myFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String newLine = "Java Programming is awesome! java\n";
            bufferedWriter.write(newLine);
            bufferedWriter.close();
            System.out.println("New line is appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}