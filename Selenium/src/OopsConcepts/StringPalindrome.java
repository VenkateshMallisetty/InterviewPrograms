package OopsConcepts;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "MADAM";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		//System.out.println(reverse);

		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("Given string is Palindrome:" + reverse);
		} else {
			System.out.println("Given String is not Palindrome:" + reverse);
		}

		String s1 = "A45EZ6G9D";
		String s2 = "NV7S6DF6L";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s2.charAt(i) + "" + s1.charAt(i));
		}
		
	}

}
