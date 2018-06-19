package InterviewQuestions;

public class PrintCharacter {

	public static void main(String[] args) {

		/*String s="venkat12357";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) 
			System.out.print(ch[i]);
			
		}*/
		
		
		
		String s="Bangalore12345";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isDigit(ch[i]))
			System.out.print(ch[i]);
		}
		
	}

}
