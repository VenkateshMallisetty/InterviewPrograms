package InterviewQuestions;


public class Practise {
	static void Sorting(int[]arr){
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(arr[j-1]>arr[j]){
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int []arr={5,2,3,1,76,83,92,176,345,4};
		System.out.println("Before Every Method");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Sorting(arr);
		
		System.out.println("After Every Method");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
		


