package Oops;

public class Overload {


	public void add(int a, int b) {
		int x = a + b;
		System.out.println("the value of x" + x);

	}

	public void add(int a, int b, int c) {
		int y = a + b + c;
		System.out.println("the value of x and y" + y);

	}

	public void add(double a, double b) {
		double z = a + b;
		System.out.println("the value of z" + z);

	}

	public static void main(String[] args) {
		Overload md = new Overload();
		md.add(7, 8);
		md.add(67, 89, 98);
		md.add(50.90, 49.10);

	}
}



