package QueuePrograme;
//Enqueue: Add an element to the end of the queue. 
//Dequeue: Remove an element from the front of the queue.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue circularQueue = new CircularQueue(5);
		System.out.println(" is empty :"+circularQueue.isEmpty());
		
		System.out.println(" is full :"+circularQueue.isFull());
		
		circularQueue.enQueue(2);
		circularQueue.enQueue(3);
		circularQueue.enQueue(4);
		circularQueue.enQueue(5);
		circularQueue.enQueue(6);
		circularQueue.delete();
		circularQueue.enQueue(7);
		int peekValue = circularQueue.peek();
		System.out.println(" peekValue : "+peekValue);
		
		 int firstValue =circularQueue.deQueue();
			System.out.println(" firstValue : "+firstValue);		
			 int secondValue =circularQueue.deQueue();
				System.out.println(" secondValue : "+secondValue);
			
			System.exit(0);
		
		QueueArray newQueue = new QueueArray(5);
		newQueue.enQueue(1);
		newQueue.enQueue(2);
		newQueue.enQueue(3);
		newQueue.enQueue(4);
		newQueue.enQueue(5);
		
		
		
		boolean result = newQueue.isFull();
		System.out.println(result);
		int resultDequeu = newQueue.deQueue();
		System.out.println(resultDequeu);

		 resultDequeu = newQueue.deQueue();
		System.out.println(resultDequeu);
		
		 resultDequeu = newQueue.deQueue();
		System.out.println(resultDequeu);
		
		
		 resultDequeu = newQueue.peek();
		System.out.println(resultDequeu);
		
		//newQueue.delete();		
		
		boolean resultE = newQueue.isEmpty();
		System.out.println(resultE);
		
		
	}

}
