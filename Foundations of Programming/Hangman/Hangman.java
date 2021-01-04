import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private int numberOfGuesses = 8;
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        HangmanLexicon wordList = new HangmanLexicon();

        Random random = new Random();
        int index = random.nextInt(wordList.getWordCount());
        String word = wordList.getWord(index);
        String guess;

        System.out.println("Welcome to Hangman!");
        String temporary = "";
        for(int i = 1; i <= word.length(); i++) {
            temporary = temporary.concat("-");
        }

        StringBuilder partialGuessedWord = new StringBuilder(temporary);
        commonMessage(partialGuessedWord);

        while(numberOfGuesses != 0) {
            guess = takingGuess().toUpperCase();

            if(word.contains(guess)) {
                int charIndex = word.indexOf(guess);
                partialGuessedWord.setCharAt(charIndex, guess.charAt(0));

                //checking if the word has more characters same as the guess
                while(charIndex >= 0) {
                    charIndex = word.indexOf(guess, charIndex+1);
                    if(charIndex != -1)
                        partialGuessedWord.setCharAt(charIndex, guess.charAt(0));
                }

                if(word.contentEquals(partialGuessedWord)) {
                    System.out.println("That guess is correct.");
                    System.out.println("You guessed the word: " + word);
                    System.out.println("You win.");
                    break;
                }

                answerIsCorrect(partialGuessedWord);
            }
            else {
                numberOfGuesses--;
                if(numberOfGuesses != 0)
                    answerIsWrong(guess, partialGuessedWord);
                else {
                    System.out.println("There are no " + guess + "'s in the word.");
                    System.out.println("You are completely hung.");
                    System.out.println("The word was: " + word);
                    System.out.println("You lose.");
                }
            }
        }
    }


    private void answerIsCorrect(StringBuilder newWord) {
        System.out.println("That guess is correct.");
        commonMessage(newWord);
    }

    private void answerIsWrong(String guess, StringBuilder newWord) {
        System.out.println("There are no " + guess + "'s in the word.");
        commonMessage(newWord);
    }

    private void commonMessage(StringBuilder newWord) {
        System.out.println("The word now looks like this: " + newWord);

        if(numberOfGuesses == 1)
            System.out.println("You have only one guess left.");
        else {
            System.out.println("You have " + numberOfGuesses + " left.");
        }
    }

    private String takingGuess() {
        System.out.print("Your guess: ");
        String guess = scanner.nextLine();

        if(guess.length() != 1){
            System.out.println("Your guess is illegal!");
            guess = takingGuess();
        }
        else {
            char[] array = guess.toCharArray();
            if(Character.isDigit(array[0])) {
                System.out.println("Your guess is illegal!");
                guess = takingGuess();
            }
        }

        return guess;
    }
}
