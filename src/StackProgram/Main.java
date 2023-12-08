package StackProgram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainSll(); // create stack using Single link list
		
		Stack newStack = new Stack(4);
		newStack.push(1);
		newStack.push(2);
		newStack.push(1);
		newStack.push(3);
		//newStack.push(6);
		

		int resultpeak =  newStack.peak();
		System.out.println("stack peak :"+ resultpeak);
		
		int resultData =  newStack.pop();		
		System.out.println("stack data :"+ resultData);
		
		resultData =  newStack.pop();
		System.out.println("stack data :"+ resultData);
		boolean result = newStack.isEmpty();
		System.out.println("is empty :"+result);
		boolean resultFull = newStack.isFull();
		System.out.println("is full :"+resultFull);
		newStack.delete();
	}
	
	public static void mainSll() {
		StackUsingSLL newStackBySLL = new StackUsingSLL();
		newStackBySLL.push(1);
		newStackBySLL.push(3);
		newStackBySLL.push(2);
		
		int popElement = newStackBySLL.pop();
		System.out.println(" popElement = "+ popElement);
		System.out.println(" is empty = "+ 	newStackBySLL.isEmpty());
		
		int peekElement1 = newStackBySLL.peek(); // peek method did not delete node
		System.out.println(" peekElement1 = "+ peekElement1);
		
		int popElement1 = newStackBySLL.pop();
		System.out.println(" popElement = "+ popElement1);
	
		
		int popElement2 = newStackBySLL.pop();
		System.out.println(" popElement = "+ popElement2);

		int popElement3 = newStackBySLL.pop();
		System.out.println(" popElement = "+ popElement3);
		 
		newStackBySLL.deleteStack();
	}

}
