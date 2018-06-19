package InterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {

		int flag =0, m;
	
		int n=71;
		 m = n/2;
		 for(int i=2;i>=m;i++) {
				if(n%i==0) {
					System.out.println("Given number is not prime:"+n);
				flag=1;
				break;
				
				}
			} 
		if(flag==0) {
			System.out.println("Given number is prime:"+n);
		}
	}
}

