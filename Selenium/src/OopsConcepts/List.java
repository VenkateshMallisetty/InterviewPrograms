package OopsConcepts;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		ArrayList<String> name=new ArrayList<>();
		name.add("Venkatesh");
		name.add("Mallisetty");
		
		String[] names=name.toArray(new String[name.size()]);
		for(String name1:names){
			System.out.println(name1);
		}
		
	}

}
