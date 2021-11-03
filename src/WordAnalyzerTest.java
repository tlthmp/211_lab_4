import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author rhodes
 *
 */
public class WordAnalyzerTest {

	
	@Test(expected=IllegalArgumentException.class)
	public void ConstructorWithNULLandCRCShouldThrow() {
		
		WordAnalyzer w =new WordAnalyzer(null);
		
		w.countRepeatedCharacters();
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void ConstructorWithNULLShouldThrow() {
		
		WordAnalyzer w =new WordAnalyzer(null);
		
	}


	@Test
	public void FRC_first_Character_repeated() {
		
		WordAnalyzer w =new WordAnalyzer("aardvark");

		assertEquals(w.firstRepeatedCharacter(), 'a');
	}
	
	@Test
	public void firstRepeatedCharacterFail(){
		
		WordAnalyzer w =new WordAnalyzer("foobar");
		assertEquals(w.firstRepeatedCharacter(), 'o');
		
	}
	
	
	
	



}
