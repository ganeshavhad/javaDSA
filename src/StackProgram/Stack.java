package StackProgram;

public class Stack {
	int[] arr;
	int topOfStack;
	
	public Stack(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("the stack is created with size of :"+size);
		
	}
	//isEmpty
	public boolean isEmpty() {
		if(topOfStack==-1) {
			return true;
		}else {
			return false;
		}
	}
	//isEmpty
		public boolean isFull() {
			if(topOfStack==arr.length-1) {
				//System.out.println("the stack is full");
				return true;
			}else {
				return false;
			}
		}
	//push method
		public void push(int value) {
			if(isFull()==false) {
				arr[topOfStack+1]= value;
				topOfStack++;
			}else {
				System.out.println("the stack is full");
			}
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("the stack is Empty");
				return -1;
			}else {
				int topStack= arr[topOfStack];
				topOfStack--;
				return topStack;				
			}
			
		}
		
		// peak
		public int peak(){
			if(isEmpty()) {
				System.out.println("the stack is Empty");
				return -1;
			}else {
			 return  arr[topOfStack];
			}
		}
		
		// delete
		public void delete() {
			arr = null;
			System.out.println("the stack is deleted");
			
		}
}
