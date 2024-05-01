import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class list6_12 {

    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");

        Path filePath = Paths.get("myData.csv");

        try {
            Files.deleteIfExists(filePath);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }
}