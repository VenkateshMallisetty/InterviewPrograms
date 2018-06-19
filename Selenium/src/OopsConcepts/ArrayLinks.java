package OopsConcepts;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinks {

	public static void main(String[] args) {
					
		ArrayList l=new ArrayList<>();
				
				l.add("Ravi");
				l.add("Kumar");
				l.add("null");
				l.add(10);
				l.add("null");
				l.add('c');
				System.out.println(l.size());
				System.out.println(l);
				
				l.remove(2);
				System.out.println(l);
				
				l.add(10);
				l.add("null");
				System.out.println(l);
				
				LinkedList ll=new LinkedList<>();
				ll.add("Ravi");
				ll.add("Kumar");
				ll.add("Ravi");
				ll.set(0,"Hai");
				ll.add(0,"see");
				//ll.add(1,"Hello");
				ll.removeLast();
				ll.addFirst("Sir");
				
				System.out.println(ll.size());
				System.out.println(ll);

			
				
			
				
			
				
				
				
				
				
				
				
					
			
			
		
	}

}
