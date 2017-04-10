package javaoo.hangman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hangman {
	public static final Map<Integer, List<String>> words;
	static {
		words = new HashMap<Integer, List<String>>();
		
		List<String> threeLetterWords = new ArrayList<String>();
		threeLetterWords.add("cat");
		threeLetterWords.add("dog");
		threeLetterWords.add("bat");
		threeLetterWords.add("sky");
		words.put(3, threeLetterWords);
		
		List<String> fourLetterWords = new ArrayList<String>();
		fourLetterWords.add("book");
		fourLetterWords.add("tray");
		fourLetterWords.add("beer");
		fourLetterWords.add("brat");
		words.put(4, fourLetterWords);
		
		List<String> fiveLetterWords = new ArrayList<String>();
		fiveLetterWords.add("treat");
		fiveLetterWords.add("greet");
		fiveLetterWords.add("surge");
		fiveLetterWords.add("plane");
		words.put(5, fiveLetterWords);
	}
	
	public final int wordLength;
	public int score;
	public List<String> guess;
	public int guessCount;
	public String solution;
	
	public Hangman(int wordLength) {
		try {
			HangmanValidator.validate(wordLength);
		} catch (HangmanException e) {
			wordLength = 4;
		}
		
		this.wordLength = wordLength;
		this.solution = words.get(wordLength).get((int) Math.floor(Math.random() * 4));
		this.guess = new ArrayList<String>();
	}

	public void guess(String letter) throws HangmanException {
		guess.add(letter);
		HangmanValidator.validateGuessCount(guessCount);
		guessCount++;
	}

	private void stop() {
		// TODO Auto-generated method stub
		
	}

	public boolean checkForWin() {
		if(guess.size() != solution.length()) {
			return false;
		}
		
		Collections.sort(guess);
		
		char[] solutionArr = solution.toCharArray();
		List<String> solutionList = new ArrayList<String>();
		for(char character : solutionArr) {
			solutionList.add(String.valueOf(character));
		}
		
		Collections.sort(solutionList);
		
		for(int i = 0; i < solutionList.size(); i++) {
			if(!solutionList.get(i).equals(guess.get(i))) {
				return false;
			}
		}
		
		return true;
	}


}
