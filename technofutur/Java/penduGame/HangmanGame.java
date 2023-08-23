package technofutur.Java.penduGame;

import java.io.*;
import java.util.*;

public class HangmanGame {
    private static final String CATEGORIES_FILE = "C:\\java_projects\\technofutur\\Java\\penduGame\\categories";
    private Map<String, List<String>> categories = new HashMap<>();
    private List<String> words = new ArrayList<>();
    private String selectedCategory;



    public void readCategoriesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CATEGORIES_FILE))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String category = parts[0];
                String[] words = parts[1].split(",");
                categories.put(category, Arrays.asList(words));
            } else {
                System.out.println("Malformed line in categories file: " + line);
            }
        }
    } catch(IOException e) {
        e.printStackTrace();
        }
    }

    public void chooseCategory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available categories: ");
        for (String category : categories.keySet()) {
            System.out.println(category);
        }

        System.out.print("Choose a category: ");
        selectedCategory = scanner.nextLine();

        if (!categories.containsKey(selectedCategory)) {
            System.out.println("Invalid category. Exciting.");
            System.exit(1);
        }
    }
    public void readWordsFromFile() {
        words = categories.get(selectedCategory);
    }

    public void playHangman() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The game begin!");
        String playAgain;
        do {
            String selectedWord = words.get(new Random().nextInt(words.size()));
            int attempts = 6;
            StringBuilder guessedWord = new StringBuilder("_".repeat(selectedWord.length()));

            while (attempts > 0 && guessedWord.toString().contains("_")) {
                System.out.println("Word: " + guessedWord);
                System.out.println("Attempts left: " + attempts);

                System.out.println("Guess a letter: ");
                char guess = scanner.nextLine().charAt(0);

                boolean found = false;
                for (int i = 0; i < selectedWord.length(); i++) {
                    if (selectedWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                        found = true;
                    }
                }

                if (!found) {
                    attempts--;
                    System.out.println("Incorrect guess");
                }
            }

            if (guessedWord.toString().equals(selectedWord)) {
                System.out.printf("Congratulations! You guessed the word: %s ", selectedWord);
            } else {
                System.out.printf("Sorry, you're out of attempts. The word was: %s ", selectedWord);
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
    }

    public void addWordToCategory(String newWord) {
        if (categories.containsKey(selectedCategory)) {
            List<String> categoryWords = new ArrayList<>(categories.get(selectedCategory));
            categoryWords.add(newWord);
            categories.put(selectedCategory, categoryWords);
            updateCategoriesFile();
            System.out.println("Word added to category. ");
        } else {
            System.out.println("Category not found.");
        }
    }

    public void createCategory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the new category: ");
        String newCategory = scanner.nextLine();

        if (!categories.containsKey(newCategory)) {
            categories.put(newCategory, new ArrayList<>());
            updateCategoriesFile();
            System.out.println("New category created.");
        } else {
            System.out.println("Category already exists.");
        }
    }
    public void updateCategoriesFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CATEGORIES_FILE))) {
            for (String category : categories.keySet()) {
                List<String> words = categories.get(category);
                String wordsString = String.join(",", words);
                writer.write(category + ":" + wordsString);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteWordFromCategory(String wordToDelete) {
        if (categories.containsKey(selectedCategory)) {
            List<String> categoryWords = new ArrayList<>(categories.get(selectedCategory));
            if (categoryWords.remove(wordToDelete)) {
                categories.put(selectedCategory, categoryWords);
                updateCategoriesFile();
                System.out.println("Word deleted from category.");
            } else {
                System.out.println("Word not found in category.");
            }
        } else {
            System.out.println("Category not found.");
        }
    }
    public void modifyContent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selected category: " + selectedCategory);
        System.out.println("Current words in " + selectedCategory + ":");
        for (String word : categories.get(selectedCategory)) {
            System.out.println(word);
        }

        System.out.println("1. Add word");
        System.out.println("2. Delete word");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            // Adding a new word
            System.out.print("Enter a new word to add: ");
            String newWord = scanner.nextLine();
            addWordToCategory(newWord);
        } else if (choice == 2) {
            // Deleting a word
            System.out.print("Enter the word to delete: ");
            String wordToDelete = scanner.nextLine();
            deleteWordFromCategory(wordToDelete);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        String choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Play ");
            System.out.println("2. Modify Content");
            System.out.println("3. Create Category");
            System.out.println("4. Delete Category");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {readCategoriesFromFile();chooseCategory();readWordsFromFile();playHangman();}
                case "2" -> {readCategoriesFromFile();chooseCategory();modifyContent();}
                case "3" -> createCategory();
                case "4" -> {readCategoriesFromFile();deleteCategory();}
                case "5" -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public void deleteCategory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available categories: ");
        for (String category : categories.keySet()) {
            System.out.println(category);
        }
        System.out.println("Enter the name of the category to delete: ");
        String categoryToDelete = scanner.nextLine();

        if (categories.containsKey(categoryToDelete)) {
            categories.remove(categoryToDelete);
            updateCategoriesFile();
            File wordsFile = new File(categoryToDelete + " ");
            if (wordsFile.exists()) {
                wordsFile.delete();
                System.out.println("Category and associated words file deleted.");
            } else {
                System.out.println("Category deleted. Associated words file not found.");
            }
        } else {
            System.out.println("Category not found.");
        }
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.displayMenu();
    }
}