package InterviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {

		int n=123;
		int r=0;
		while(n>0) {
			r=r*10+n%10;
			n=n/10;
		}
		System.out.println(r);
	
	
	}

}
