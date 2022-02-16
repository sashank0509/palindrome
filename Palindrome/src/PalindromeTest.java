import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

	// unit test to test the findNextPalindrome method
	@Test
	public void testFindNextPalindrome() {
		assertEquals(181, Palindrome.findNextPalindrome(173));
		assertEquals(232, Palindrome.findNextPalindrome(225));
		assertEquals(636, Palindrome.findNextPalindrome(632));
	}

	// unit test to test the checkPalindrome method
	@Test
	public void testCheckPalindrome() {
		assertTrue(Palindrome.checkPalindrome("181"));
		assertTrue(Palindrome.checkPalindrome("madam"));
		assertFalse(Palindrome.checkPalindrome("offer"));
		assertTrue(Palindrome.checkPalindrome("343"));
	}

}
