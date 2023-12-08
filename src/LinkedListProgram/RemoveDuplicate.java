package LinkedListProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList =  new LinkedList<String>();
		strList.add("apple");
		strList.add("banana");
		strList.add("custurdApple");
		strList.add("chiku");
		strList.add("papaya");
		strList.add("apple");
		//System.out.println("09090");
		
		Set<String> strSet = new HashSet<String>(strList);
		
		Iterator itr = strList.iterator();
		
		Iterator itrSet = strSet.iterator();
		
		while(itr.hasNext()) {
			System.out.print(" list = "+itr.next());
		}
		
		System.out.println(" ");
		
		while(itrSet.hasNext()) {
			System.out.print(" set =="+itrSet.next().toString());
		}
		
		System.out.println(" ");
	
		
	}
	
	public void deleteDup(LinkedListCreation ll) {
		HashSet<Integer> hs = new HashSet();
		Node current = ll.head;
		Node prev = null;
		while(current!=null) {
			int curval = current.value;
			if(hs.contains(curval)) {
				prev.next = current.next;
				ll.size--;
			}else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}
	}

}
