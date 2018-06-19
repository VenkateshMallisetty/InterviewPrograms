package InterviewQuestions;

public class PalindromrNumber {

	public static void main(String[] args) {
 
		int n=121;
		int r=0;
		int temp=n;
		while(n>0){
			r=r*10+n%10;
			n=n/10;
		
		}
		if(temp == r){
			System.out.println("Given number is palindrome: "+r);
		}else{
			System.out.println("Given number is not palindrome: "+r);
		}
	}
	
	
	
	
	
	

}
