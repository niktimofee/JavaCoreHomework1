import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    public static void writeToFile(Note note) {
        try {
            FileWriter writer = new FileWriter("notes.txt", true);
            writer.write(note.getFormattedNote() + "\n");
            writer.close();
            System.out.println("Written to file: " + note.getFormattedNote());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}