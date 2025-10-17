import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "login.txt"; 
        String contentToAdd = "\nThis line was appended.";

        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(contentToAdd);
            writer.close();
            System.out.println("Successfully appended to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}