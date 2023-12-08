package LinkedListProgram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCreation sll = new LinkedListCreation();
		sll.CreateLinkList(5);
		//System.out.println(sll.head.value);
		sll.insertLinkedList(6, 1);
		//System.out.println(sll.head.next.value);	
		sll.insertLinkedList(7, 3);
		sll.insertLinkedList(9, 1);		
		sll.insertLinkedList(8, 2);
		sll.insertLinkedList(7, 5);
		//sll.deleteSLL();
		sll.traverseSinglyLinkedList();
		RemoveDuplicate dup = new RemoveDuplicate();
		dup.deleteDup(sll);
		//sll.deletionOfNode(8);
		sll.traverseSinglyLinkedList();
		//System.out.println(sll.head.next.next.value);
		sll.searchNode(7);
	}

}
