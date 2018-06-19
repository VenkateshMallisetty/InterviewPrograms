package Oops;

public class  Animals implements Animal{
	    public void eat(){
		System.out.println("Animal eats");
		}
		public void travel(){
		System.out.println("Animals travels");
		}
		public static void main(String[] args) {
		               Animals  s=new Animals();
		               s.eat();
		               s.travel();
		}
		}

