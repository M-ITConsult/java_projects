// Hi-Lo Guessing Game App!
//import java.util.Scanner;
//
//public class HiLo {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        String playAgain;
//
//        do {
//            // Create a random number for the user to guess
//            int theNumber = (int) (Math.random() * 100 + 1);
//            // System.out.println(theNumber);
//
//            int guess = 0;
//
//            while (guess != theNumber) {
//
//                System.out.print("Guess a number between 1 and 100: ");
//
//                guess = scan.nextInt();
//
//                if (guess < theNumber)
//                    System.out.println(guess + " is too low. Try again.");
//                else if (guess > theNumber)
//                    System.out.println(guess + " is too high. Try again.");
//                else
//                    System.out.println(guess + " is correct. You win!");
//            } // End of while loop guessing
//
//            System.out.println("Would you like to play again (y/n)?");
//
//            playAgain = scan.next();
//
//            } while (playAgain.equalsIgnoreCase("y"));
//                System.out.println("Thank you for playing! Goodbye.");
//            scan.close();
//        }
//    }

import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rounds to win: ");
        int roundsToWin = scan.nextInt();

        System.out.print("Enter Player 1's name: ");
        String player1Name = scan.next();

        System.out.print("Enter Player 2's name: ");
        String player2Name = scan.next();

        String playAgain;

        do {
            int player1Score = 0;
            int player2Score = 0;

            for (int round = 1; round <= roundsToWin; round++) {
                System.out.println("\nRound " + round + " - " + player1Name + " vs " + player2Name);

                int theNumber = (int) (Math.random() * 100 + 1);
                int player1Guess = 0;
                int player2Guess = 0;

                while (player1Guess != theNumber && player2Guess != theNumber) {

                    System.out.print(player1Name + ", guess a number between 1 and 100: ");
                    player1Guess = scan.nextInt();

                    if (player1Guess < theNumber)
                        System.out.println(player1Guess + " is too low. Try again.");
                    else if (player1Guess > theNumber)
                        System.out.println(player1Guess + " is too high. Try again.");
                    else
                        player1Score++;

                    System.out.print(player2Name + ", guess a number between 1 and 100: ");
                    player2Guess = scan.nextInt();

                    if (player2Guess < theNumber)
                        System.out.println(player2Guess + " is too low. Try again.");
                    else if (player2Guess > theNumber)
                        System.out.println(player2Guess + " is too high. Try again.");
                    else
                        player2Score++;
                } // End of while loop guessing

                System.out.println("Round " + round + " result:");
                System.out.println(player1Name + ": " + player1Score + " points");
                System.out.println(player2Name + ": " + player2Score + " points");

                if (player1Score > player2Score)
                    System.out.println(player1Name + " wins this round!");
                else if (player2Score > player1Score)
                    System.out.println(player2Name + " wins this round!");
                else
                    System.out.println("It's a tie!");

            } // End of rounds loop

            if (player1Score > player2Score)
                System.out.println(player1Name + " wins the game!");
            else if (player2Score > player1Score)
                System.out.println(player2Name + " wins the game!");
            else
                System.out.println("The game is a tie!");

            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing! Goodbye.");
        scan.close();
    }
}
