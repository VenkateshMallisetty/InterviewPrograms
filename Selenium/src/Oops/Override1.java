package Oops;

public class Override1 extends Override {
	
	public void speed() {// same method
		System.out.println("Bird is flying very fastly");
	}

	public static void main(String[] args) {
		Override1 mo = new Override1();
		mo.speed();
		Override rn = new Override();
		rn.speed();
		rn.colour();

	}
}
