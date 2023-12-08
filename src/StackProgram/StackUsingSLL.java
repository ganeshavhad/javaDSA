package StackProgram;

import LinkedListProgram.LinkedListCreation;

public class StackUsingSLL {

	LinkedListCreation sllObj;
	
	public StackUsingSLL() {
		sllObj = new LinkedListCreation();
	}
	
	// push method
	public void push(int value) {
		//used 0 for insert at the beginning
		sllObj.insertLinkedList(value, 0);
		System.out.println("insert successfull Stack SLL "+ value);
	}
	
	public boolean isEmpty() {
		if(sllObj.head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	//pop method
	public int pop() {
		int result = -1;
		if(isEmpty()) {
			System.out.println(" Stack is empty ");
		}else {
			result = sllObj.head.value;
			sllObj.deletionOfNode(0);
		}
		return result;
	}
	
	//peek method
	public int peek() {
		int result = -1;
		if(isEmpty()) {
			System.out.println(" Stack is empty ");
		}else {
			result = sllObj.head.value;
			//sllObj.deletionOfNode(0);
		}
		return result;
	}
	
	// delete stack
	public void deleteStack() {
		sllObj.head = null;
		System.out.println(" Stack is deleted ");
	}
}
