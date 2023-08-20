import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class pr_25 {

    public static void main(String[] args) {
        // Check if the filename is provided as a command line argument
        if (args.length < 1) {
            System.out.println("Please provide the filename as a command line argument.");
            System.exit(1);
        }

        String filename = args[0];
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                words.addAll(Arrays.asList(lineWords));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            System.exit(1);
        }

        // Count the occurrence of each word
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Filter out the non-duplicate words
        List<String> nonDuplicateWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == 1) {
                nonDuplicateWords.add(entry.getKey());
            }
        }

        // Sort the non-duplicate words in decreasing order
        Collections.sort(nonDuplicateWords, Collections.reverseOrder());

        // Display the non-duplicate words
        for (String word : nonDuplicateWords) {
            System.out.println(word);
        }
    }
}
