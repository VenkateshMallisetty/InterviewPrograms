package InterviewQuestions;

public class Patron {

	public static void main(String[] args) {
		int i = 7;
		for (int a = 7; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		int c = 7;
		for (int x = 1; x <= 7; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
