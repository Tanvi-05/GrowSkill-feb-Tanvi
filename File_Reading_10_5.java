package weekelyAssignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_Reading_10_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print(" Enter file path: ");
        String fileName = scanner.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        String longestWord = "";

       
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Requirement: Read the file line by line
            while ((line = br.readLine()) != null) {
                lineCount++;
                
                // Total characters (including spaces, excluding line breaks)
                charCount += line.length();

                // Split line into words using whitespace as delimiter
                // "\\s+" handles multiple spaces, tabs, etc.
                String[] words = line.trim().split("\\s+");
                
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                    
                    // Find the longest word
                    for (String word : words) {
                        // Clean punctuation if necessary (optional improvement)
                        String cleanWord = word.replaceAll("[^a-zA-Z]", "");
                        if (cleanWord.length() > longestWord.length()) {
                            longestWord = cleanWord;
                        }
                    }
                }
            }

            // Display results
            System.out.println("\n--- Analysis Results ---");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Longest Word: " + longestWord);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

