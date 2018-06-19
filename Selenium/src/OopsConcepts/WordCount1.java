package OopsConcepts;

public class WordCount1 {

	public static void main(String[] args) {

		String s = "Welcome to India is India India India India";
		String[] words = s.split("India");
		int count = 1;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[i])) {
					count++;
					words[j] = "0";

				}
			}

			if (words[i] != "0")
				System.out.println("India = " + count);
		}

		
	}

}
