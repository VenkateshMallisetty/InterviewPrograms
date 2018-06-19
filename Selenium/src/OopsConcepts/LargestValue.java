package OopsConcepts;

public class LargestValue {

	public static void main(String[] args) {

int a[]={5,86,4,54,99,56,2,54,62,100};
		
		int firstmax=0;
		int secondmax=0;
		for(int i=0;i<=a.length-1;i++){
			if(a[i]>firstmax){
				secondmax=firstmax;
				firstmax=a[i];
			}
			else if(a[i]>secondmax){
				secondmax=a[i];
			}
		}
		
		System.out.println(firstmax);
		System.out.println(secondmax);

	
	}

}
