import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public final class Main {
    /**
     * The name of the input file.
     */
    private static final String INPUT_FILE = "input.txt";
    /**
     * The name of the output file.
     */
    private static final String OUTPUT_FILE = "output.txt";
    /**
     * Private constructor to prevent instantiation.
     * @throws IllegalStateException Utility class.
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * The main method to read student data from a
     * file and write it to another file.
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        // Check if the input file exists
        try (Scanner scanner = new Scanner(new File(INPUT_FILE));
                FileWriter writer = new FileWriter(OUTPUT_FILE)) {
            // Check if the input file is empty
            while (scanner.hasNextLine()) {
                // Read each line from the input file
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    writer.write("Empty line.\n");
                } else {
                    // Split the line into parts
                    String[] parts = line.split(" ");
                    if (parts.length < 5) {
                        writer.write("Invalid student data.\n");
                    } else {
                        String firstName = parts[0];
                        String midInit = parts[1];
                        String lastName = parts[2];
                        String grade = parts[3];
                        String iep = parts[4];
                        // Create a new Student object
                        //Write its string representation to the output file
                        Student student = new Student(firstName, midInit,
                                 lastName, grade, iep);
                        writer.write(student.toString() + "\n\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
