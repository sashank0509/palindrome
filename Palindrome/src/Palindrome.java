import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	// method to find the next palidrome of the given input
	public static int findNextPalindrome(int inputValue) {
		// incrementing the input with 1 to avoid the given number itself a palindrome
		inputValue++;

		while (!checkPalindrome(Integer.valueOf(inputValue).toString()))
			inputValue++;

		return inputValue;
	}

	// method to check the given input string is palindrome or not
	public static boolean checkPalindrome(String inputString) {
		char[] inputCharacters = inputString.toCharArray();
		int left = 0;
		int right = inputCharacters.length - 1;

		while (left < right) {
			if (inputCharacters[left] == inputCharacters[right]) {
				left += 1;
				right -= 1;
			} else
				return false;
		}

		return true;
	}

	// main method
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// reading the input from the console
		System.out.print("Enter the input number: ");
		int input = Integer.parseInt(bufferedReader.readLine());

		System.out.println("The next highest palindrome of " + input + " is: " + findNextPalindrome(input));
	}

}
