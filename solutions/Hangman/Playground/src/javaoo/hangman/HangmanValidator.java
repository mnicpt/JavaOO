package javaoo.hangman;

public class HangmanValidator {

	public static void validate(int wordLength) throws HangmanException {
		if(wordLength < 3 || wordLength > 5) {
			throw new HangmanException("Word length must be 3, 4 or 5.");
		}
	}

	public static void validateGuessCount(int guessCount) throws HangmanException {
		if(guessCount == 10) {
			throw new HangmanException("You are only allowed ten guesses.");
		}
	}

}
