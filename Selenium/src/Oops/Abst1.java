package Oops;

public class Abst1 extends Abst {
	int matches=500;
	public void player(){
		System.out.println("sachin="+matches);
	}
	public static void main(String[] args) {
		Abst1 ab=new Abst1();
		ab.runs();
		ab.player();
		

	}


}
