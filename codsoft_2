import java.util.*;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Enter text or provide a file path:");
        String input = scanner.nextLine();

        String text = "";
        if (input.toLowerCase().endsWith(".txt")) {
            text = readFromFile(input);
        } else {
            text = input;
        }

        String[] words = text.split("[\\p{Punct}\\s]+");
        int wordCount = words.length;

        System.out.println("Total word count: " + wordCount);

        scanner.close();
    }

    public static String readFromFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            return content.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
        return "";
    }
}
