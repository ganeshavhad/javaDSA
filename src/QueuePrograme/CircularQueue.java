package QueuePrograme;

public class CircularQueue {
	int[] arr;
	int topOfQueue;
	int beginingOfQueue;
	int size;
	
	public CircularQueue(int size) {
		this.arr = new int[size];
		this.size = size;
		this.topOfQueue = -1;
		this.beginingOfQueue = -1;
		System.out.println("Queue successfully created with size : "+size);
	}
	
	public boolean isEmpty() {
		if(topOfQueue == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		// 1,2,3,4,5 = 5+1==1 = false
		if(topOfQueue+1 == beginingOfQueue){
			return true;
		}else if(beginingOfQueue==0 && topOfQueue+1==size){
			return true;
		}else {
			return false;
		}
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full : "+size);
		}else if(isEmpty()) {
			beginingOfQueue = 0;
			topOfQueue++;
			arr[beginingOfQueue]= value;
			System.out.println("value insert in Queue : "+value);
		}else {
			if(beginingOfQueue+1==size) {
				topOfQueue = 0;
			}else {
				topOfQueue++;
			}
			arr[topOfQueue]= value;
			System.out.println("value insert in Queue : "+value);
		}
	}
	
	public int deQueue() {		
		if(isEmpty()) {
			System.out.println("Queue is empty : ");
			return -1;
		}else {
			int result = arr[beginingOfQueue];
			arr[beginingOfQueue] =0;
			if(beginingOfQueue==topOfQueue) {
				beginingOfQueue = topOfQueue = -1;
			}else if(beginingOfQueue+1 == size) {
				beginingOfQueue =0;
			}else {
				beginingOfQueue++;
			}
			return result;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty : ");
			return -1;
		}else {
			return arr[beginingOfQueue];
		}
	}
	
	public void delete() {
		arr = null;
		System.out.println("Queue is deleted : ");
	}
	
}


