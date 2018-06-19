 package InterviewQuestions;

public class WordReverse {

	public static void main(String[] args) {

		String s="I Love My India";
		String[]word=s.split(" ");
		String reverse="";
		for(int i=word.length-1;i>=0;i--) {
			reverse=reverse+word[i]+" ";
		//	System.out.print(word[i]);
		}
		System.out.print(reverse);
	}

}
