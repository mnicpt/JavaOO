package javaoo.hangman;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HangmanTest {

	private Hangman game;
	
	@Before
	public void setup() {
		game = new Hangman(4);
	}
	
	@After
	public void teardown() {
		game = null;
	}
	
	@Test
	public void shouldAllowTenGuesses() {
		try {
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
		} catch (HangmanException e) {
			fail("Should allow 10 guesses.");
		}	
	}
	
	@Test
	public void shouldNotAllowMoreThanTenGuesses() {
		try {
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			game.guess("b");
			fail("Shouldn't allow more than 10 guesses.");
		} catch (HangmanException e) {
			assertNotNull(e);
		}	
	}
	
	@Test
	public void shouldBeAbleToStartGame() {
		assertEquals(0, game.score);
		assertEquals(0, game.guessCount);
		assertEquals(0, game.guess.size());
		assertEquals(game.wordLength, game.solution.length());
		
	}
	
	@Test
	public void shouldBeAbleToValidateWordLengthOnGameStart() {
		game = new Hangman(2);
		assertEquals(4, game.wordLength);
		
		game = new Hangman(3);
		assertEquals(3, game.wordLength);
		
		game = new Hangman(4);
		assertEquals(4, game.wordLength);
		
		game = new Hangman(5);
		assertEquals(5, game.wordLength);
		
		game = new Hangman(6);
		assertEquals(4, game.wordLength);
	}
	
	@Test
	public void shouldBeAbleToRestartGame() {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldBeAbleToEndGame() {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldBeAbleToStoreRunningScore() {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldAddTenToScoreForCorrectGuess() {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldAddOneHundredToScoreForWin() {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldBeAbleToMakeGuess() {
		try {
			game.guess("b");
		} catch (HangmanException e) {
			fail();
		}
		assertEquals(1, game.guessCount);
		assertEquals(1, game.guess.size());
		assertEquals("b", game.guess.get(0));
	}
	
	@Test
	public void shouldBeAbleToDetermineWinFromGuess() {
		game.solution = "beer";
		try {
			game.guess("b");
		} catch (HangmanException e) {
			fail();
		}
		assertFalse(game.checkForWin());
		
		try {
			game.guess("r");
			game.guess("e");
			game.guess("e");
		} catch (HangmanException e) {
			fail();
		}
		assertTrue(game.checkForWin());
	}
	
	@Test
	public void shouldIncrementGuessCounterForEachGuess() {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldResetGameWhenGameHasEnded() {
		fail("Not yet implemented");
	}

}
