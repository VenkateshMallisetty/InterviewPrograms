package OopsConcepts;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int reverse[] = new int[a.length];
		for (int i = 0; i <=reverse.length-1 ; i++) {
			reverse[i] = a[a.length - 1 - i];
			System.out.print(reverse[i]+" ");
		}
		
		
	}

}
