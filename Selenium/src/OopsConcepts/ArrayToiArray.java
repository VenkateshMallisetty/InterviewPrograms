package OopsConcepts;

import java.util.Arrays;
import java.util.List;

public class ArrayToiArray {

	public static void main(String[] args) {

		String[] a={"Sun","Mon","Tue"};
		/*for(int i=0;i<=a.length-1;i++)
		System.out.println(a[i]);*/
		List<String> s=Arrays.asList(a);
		
		System.out.println(s);
	}

}
