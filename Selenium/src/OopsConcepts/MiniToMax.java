package OopsConcepts;

public class MiniToMax {

	public static void main(String[] args) {
		int[] a = { -5, -4, 0, 2, 10, 30, -3 };
		int smallest = 0;
		int secondSmallest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			} else if (a[i] < secondSmallest) {
				secondSmallest = a[i];
			}

		}
		System.out.println(secondSmallest);

		int a1[] = { 15, 58, 54, 1, 25, 99, 24, 2, 100, 46, 34, 49, 54 };
		int max = a1[0];
		int min = a1[0];

		for (int i = 0; i <= a1.length - 1; i++) {
			if (a1[i] > max) {
				max = a1[i];
			}

			else if (a1[i] < min) {
				min = a1[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
