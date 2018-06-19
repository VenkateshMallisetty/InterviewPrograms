package InterviewQuestions;

public class StringSwap {

	public static void main(String[] args) {
		
		/*String s1="Hello";
		String s2="World";
		
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
		String temp=s1;
		
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
		System.out.println("String temp: "+temp);
		s1=s1+s2;
		
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("String s1="+s1);

		System.out.println("String s2="+s2);

*/
		String a = "Love";  
        String b = "You";  
        System.out.println("a: " + a); 
        System.out.println("b: " +  b);
        a = a + b;  
        b = a.substring(0, a.length()-b.length());  
        a = a.substring(b.length());  
        System.out.println("a= " + a );
        System.out.println("b= " +  b);

    
        
        
	
	}
	}


