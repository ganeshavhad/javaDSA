package CollectionList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List ll = new LinkedList<Integer>();
	ll.add(1);
	ll.add(5);
	ll.add(4);
	ll.add(7);
	ll.add(3);
	ll.add(4);
	ll.add(9);
	ll.add(8);
	ll.add(5);
		for(Object obj:ll) {
			System.out.print("->"+obj);
		}
	
		Set uniqueA= new HashSet<Integer>();
		for(Object obj:ll) {
			if(uniqueA.contains(obj)) {
		
			}else {
				uniqueA.add(obj);
			
			}
		}
		System.out.println(" After"+uniqueA.getClass());
		
		Iterator itr = uniqueA.iterator();
		 
        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
		for(Object obj:uniqueA) {
			System.out.print("->"+obj);
		}
	}
	
}
