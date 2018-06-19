package OopsConcepts;

public class NumberPatron {

	public static void main(String[] args) {

		int n=1;
		for (int i =1; i<=4; i++)
		{

		for (int j =1; j <=i; j++)
		{
		System.out.print(n+" ");
		n++;
		}
		System.out.println();
		}
		
/*		Out Put
		
		1 
		2 3 
		4 5 6 
		7 8 9 10 
*/
		
		for(int i=1;i<=5;i++){
			for(int j=i;j<5;j++){
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*OutPut
		
			*
		   ***
		  *****
		 *******
		**********/
		
	}

}
