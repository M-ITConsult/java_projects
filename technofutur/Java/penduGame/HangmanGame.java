package technofutur.Java.penduGame;

import java.io.*;
import java.util.*;

public class HangmanGame {

    private static final String FILE_PATH = "C:\\java_projects\\technofutur\\Java\\penduGame\\Files\\categories";
    private static final String BACKUP_FOLDER_PATH = "C:\\java_projects\\technofutur\\Java\\penduGame\\Files\\backup";

    private Map<String, List<String>> categories;
    private String selectedCategory;

    public HangmanGame() {
        categories = new HashMap<>();
        loadCategoriesFromFile();
    }

    public void loadCategoriesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String category = parts[0];
                    String[] words = parts[1].split(",");
                    categories.put(category, Arrays.asList(words));
                } else {
                    System.out.printf("Malformed line in categories file: %s%n", line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading categories file.");
        }
    }

    public void playHangman() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available categories: ");
        for (String category : categories.keySet()) {
            System.out.println(category);
        }

        System.out.print("Choose a category: ");
        selectedCategory = scanner.nextLine();

        List<String> wordsInCategory = categories.get(selectedCategory);
        if (wordsInCategory == null || wordsInCategory.isEmpty()) {
            System.out.println("No words found in the selected category.");
            return;
        }

        Random random = new Random();
        String wordToGuess = wordsInCategory.get(random.nextInt(wordsInCategory.size()));

        int attempts = 6;
        Set<Character> usedLetters = new HashSet<>();
        char[] guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_');

        while (attempts > 0) {
            displayHangman(attempts);
            displayGuessedWord(guessedWord);

            System.out.println("Used letters: " + usedLetters);
            System.out.print("Enter a letter or the entire word: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() == 1) {
                char guess = input.charAt(0);
                if (usedLetters.contains(guess)) {
                    System.out.println("You've already guessed that letter.");
                } else {
                    usedLetters.add(guess);
                    boolean correctGuess = updateGuessedWord(guess, wordToGuess, guessedWord);
                    if (correctGuess) {
                        System.out.println("Correct guess!");
                        if (Arrays.equals(guessedWord, wordToGuess.toCharArray())) {
                            displayGuessedWord(guessedWord);
                            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                            break;
                        }
                    } else {
                        System.out.println("Incorrect guess.");
                        attempts--;
                    }
                }
            } else if (input.length() > 1) {
                if (input.equals(wordToGuess)) {
                    displayGuessedWord(wordToGuess.toCharArray());
                    System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                    break;
                } else {
                    System.out.println("Incorrect guess.");
                    attempts--;
                }
            }
        }

        if (attempts == 0) {
            displayHangman(attempts);
            System.out.println("Sorry, you've run out of attempts. The word was: " + wordToGuess);
        }
    }

    private void displayHangman(int attempts) {
        // Display hangman graphics based on attempts left
    }

    private void displayGuessedWord(char[] guessedWord) {
        System.out.println("Current word: " + new String(guessedWord));
    }

    private boolean updateGuessedWord(char guess, String wordToGuess, char[] guessedWord) {
        boolean correctGuess = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord[i] = guess;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    public void modifyContent() {
        Scanner scanner = new Scanner(System.in);
        // code added
        System.out.println("Available categories: ");
        for (String category : categories.keySet()) {
            System.out.println(category);
        }

        System.out.print("Choose a category: ");
        selectedCategory = scanner.nextLine();
        // code added
        System.out.println("Selected category: " + selectedCategory);
        System.out.println("Current words in " + selectedCategory + ":");
        List<String> wordsInCategory = categories.get(selectedCategory);
        if (wordsInCategory != null) {
            for (String word : wordsInCategory) {
                System.out.println(word);
            }
        }

        System.out.println("1. Add word");
        System.out.println("2. Delete word");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter a new word to add: ");
            String newWord = scanner.nextLine();
            addWordToCategory(newWord);
        } else if (choice == 2) {
            System.out.print("Enter the word to delete: ");
            String wordToDelete = scanner.nextLine();
            deleteWordFromCategory(wordToDelete);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void addWordToCategory(String newWord) {
        List<String> wordsInCategory = new ArrayList<>(categories.get(selectedCategory));
        wordsInCategory.add(newWord);
        categories.put(selectedCategory, wordsInCategory);
        updateCategoriesFile();
        System.out.println("Word added to category.");
}

    public void deleteWordFromCategory(String wordToDelete) {
        List<String> wordsInCategory = new ArrayList<>(categories.get(selectedCategory));
        wordsInCategory.remove(wordToDelete);
        categories.put(selectedCategory, wordsInCategory);
        updateCategoriesFile();
        System.out.println("Word deleted from category.");
    }

    public void createCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the new category: ");
        String newCategory = scanner.nextLine();
        categories.put(newCategory, new ArrayList<>());
        updateCategoriesFile();
        System.out.println("New category created.");
    }

    public void deleteCategory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available categories: ");
        for (String category : categories.keySet()) {
            System.out.println(category);
        }
        System.out.print("Enter the name of the category to delete: ");
        String categoryToDelete = scanner.nextLine();

        if (categories.containsKey(categoryToDelete)) {
            categories.remove(categoryToDelete);
            updateCategoriesFile();
            System.out.println("Category deleted.");
        } else {
            System.out.println("Category not found.");
        }
    }

    public void updateCategoriesFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (String category : categories.keySet()) {
                List<String> words = categories.get(category);
                String wordsString = String.join(",", words);
                writer.println(category + ":" + wordsString);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error updating categories file.");
        }
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Play Hangman");
            System.out.println("2. Modify Category");
            System.out.println("3. Create Category");
            System.out.println("4. Delete Category");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    game.playHangman();
                    break;
                case "2":
                    game.modifyContent();
                    break;
                case "3":
                    game.createCategory();
                    break;
                case "4":
                    game.deleteCategory();
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
