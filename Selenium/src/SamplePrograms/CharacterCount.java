package SamplePrograms;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbcc";
		int count=0;
		for(int i=1;i<=s.length()-1;i++){
			for(int j=1;j<=s.length()-1;j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			
			System.out.println(s.charAt(i)+""+count);
			count=0;
		}
	

	}

}
