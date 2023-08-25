package technofutur.Java.penduGame;

import java.io.*;
import java.util.*;

public class HangmanGame {
    private static final String CATEGORIES_FILE = "C:/java_projects/technofutur/Java/penduGame/Files/";
    private static final String DEFAULT_CATEGORY_FILE = "C:/java_projects/technofutur/Java/penduGame/Files/";
    private final Map<String, List<String>> categories = new HashMap<>();
    private List<String> words = new ArrayList<>();
    private String selectedCategory;

    // Read categories
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
                System.out.printf("Malformed line in categories file: %s", line);
            }
        }
    } catch(IOException e) {
        e.printStackTrace();
        System.out.println("Error reading categories file.");
        }
    }
    // Choose a category
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
    // Choose a file
    public void chooseFile() {
        Scanner scanner = new Scanner(System.in);

        File folder = new File(CATEGORIES_FILE);
        File[] files = folder.listFiles();

        System.out.println("Available category files:");

        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                System.out.println((i + 1) + ". " + files[i].getName());
            }

            System.out.print("Enter the number of the category file: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= files.length) {
                String categoryFileName = files[choice - 1].getName();
                readWordsFromFile(categoryFileName);
            } else {
                System.out.println("Invalid choice. Using default category.");
                readWordsFromFile(DEFAULT_CATEGORY_FILE);
            }
        } else {
            System.out.println("No category files found. Using default category.");
            readWordsFromFile(DEFAULT_CATEGORY_FILE);
        }
    }
    // Read words from a category
    public void readWordsFromFile(String categoryFileName) {
//        words = categories.get(selectedCategory);
        try {
            // Construct the full file path
            String filePath = CATEGORIES_FILE + categoryFileName;

            // Read words from the specified file and populate the 'words' list
            // Implement your file reading logic here

            // For example, using a Scanner to read each word from the file
            Scanner scanner = new Scanner(new File(filePath));
            words = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                words.add(word);
            }

            // Close the scanner
            scanner.close();

            System.out.println("Words loaded from file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            words = new ArrayList<>(); // Fallback if reading fails
        }
    }
    // The game
    public void playHangman() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The game begin!");
        String playAgain;
        do {
            String selectedWord = words.get(new Random().nextInt(words.size()));
            int attempts = 6;
            StringBuilder guessedWord = new StringBuilder("_".repeat(selectedWord.length()));

            while (attempts > 0 && guessedWord.toString().contains("_")) {
                System.out.printf("Word: %s\n", guessedWord);
                System.out.printf("Attempts left: %s\n", attempts);

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
    // Add word to a category
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
    // Create a category
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
    // Update categories file
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
    // Delete word from a category
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
    // Modify the content
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
    // Create file with content ex: Animals:pig,cow,bird...
    public void createFile(String fileName, String content){
        try {
            String sourceFilePath = "C:\\java_projects\\technofutur\\Java\\penduGame\\Files\\.";
            String classDir = new File(sourceFilePath).getParent();

            String filePath = classDir + File.separator + fileName;

            try (PrintWriter writer = new PrintWriter(filePath)) {
                writer.write(content);
                System.out.printf("File created: %s\n", filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Delete file
    public void deleteFile(String fileName) {
        File file = new File("C:/java_projects/technofutur/Java/penduGame/Files/" + fileName);
        try {
            if (file.exists()) {
                if (file.delete()) {
                    System.out.printf("File deleted: %s", fileName);
                } else {
                    System.out.println("Failed to delete the file");
                }
            } else {
                System.out.println("File not found");
            }
        } catch (SecurityException e) {
            System.out.printf("Security exception: %s", e.getMessage());
        } catch (Exception e) {
            System.out.printf("An error occured: %s", e.getMessage());
        }
    }
    // The menu
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
            System.out.println("5. Create File");
            System.out.println("6. Delete File");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {chooseFile();readCategoriesFromFile();chooseCategory();playHangman();}
                case "2" -> {readCategoriesFromFile();chooseCategory();modifyContent();}
                case "3" -> createCategory();
                case "4" -> {readCategoriesFromFile();deleteCategory();}
                case "5" -> {System.out.print("Enter the file name: ");String filName = scanner.nextLine();
                System.out.print("Enter the content: "); String content = scanner.nextLine(); createFile(filName, content);}
                case "6" -> {System.out.print("Enter the file name to delete: ");String fileToDelete = scanner.nextLine();
                deleteFile(fileToDelete);}
                case "7" -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }

    // Delete a category
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