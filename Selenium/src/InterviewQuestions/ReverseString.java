package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {

		
		// With CharAt String
		String s="Bangalore";
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);

		// Without charAt use String Buffer
		StringBuffer buffer=new StringBuffer("Hyderabad");
		buffer.reverse();
		System.out.println(buffer);
		
	}

}
