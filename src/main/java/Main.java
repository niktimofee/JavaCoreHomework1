import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter note: ");
        String inputNote = scanner.nextLine();

        Note note = new Note();
        note.setNoteText(inputNote);

        FileUtil.writeToFile(note);
    }
}