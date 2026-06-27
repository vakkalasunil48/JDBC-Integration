import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingApp {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        int lineCount = 0;
        int wordCount = 0;
        int characterCount = 0;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;

            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.write("\n");

                lineCount++;

                characterCount += line.length();

                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
            System.out.println("Number of Lines : " + lineCount);
            System.out.println("Number of Words : " + wordCount);
            System.out.println("Number of Characters : " + characterCount);

        } catch (IOException e) {

            System.out.println("Error : " + e.getMessage());

        }
    }
}