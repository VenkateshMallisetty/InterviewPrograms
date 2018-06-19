package OopsConcepts;

public class WordCount {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				String s = "aabbcc";
				int count = 0;
				for (int i = 0; i <= s.length() - 1; i++) {
					//char ch = s.charAt(i);
					for (int j = 0; j <= s.length() - 1; j++) {
						if (s.charAt(i) == s.charAt(j)) {
							count++;
						}
					}
					System.out.println(s.charAt(i) + "-" + count);
					count = 0;
				}

				/*String s = "jsd vjsdbf jbjf fanbf f fe fe g.";
				int counter = 1;
				for( int i=0; i<s.length(); i++ ) {
				    if( s.charAt(i) == ' ' ) {
				        counter++;
				    } 
				}
				System.out.println(counter);*/
				
				
				
			}
	}

