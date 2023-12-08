package CircularSinglyLinkList;

import QueuePrograme.QueueArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QueueArray newQueue = new QueueArray(5);
		CircularSinglyLinkList obj = new CircularSinglyLinkList();
		obj.createCSLL(5);
		obj.insertCSLL(4,0);
		obj.insertCSLL(5,1);
		obj.insertCSLL(6,3);
		obj.insertCSLL(8,6);
		obj.insertCSLL(12,7);
		obj.traverseCSLL();
		obj.deleteCSLL();
		obj.deleteNode(0);
		obj.traverseCSLL();
		obj.searchNode(6);
		System.out.println(obj.head.value);
		System.out.println(obj.head.next.value);
		System.out.println(obj.tail.value);
	}	
}
