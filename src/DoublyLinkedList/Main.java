package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkList dll = new DoublyLinkList();
		dll.createDLL(1);
		dll.insertDLL(2, 0);
		dll.insertDLL(4, 2);
		dll.insertDLL(33, 7);
		dll.insertDLL(22, 6);
		dll.traverseDLL();
		dll.reverseTraverseDLL();
		dll.searchNode(33);
		dll.deleteNodeDLL(6);
		dll.traverseDLL();
		System.out.println(dll.tail.value);
		
		
	}

}
