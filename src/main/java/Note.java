import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    private String noteText;

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getFormattedNote() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDate = dateFormat.format(new Date());
        return formattedDate + " -> " + noteText;
    }
}