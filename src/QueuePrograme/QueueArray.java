package QueuePrograme;

public class QueueArray {
int[] arr;
int topOfQueue;
int beginingOfQueue;

public QueueArray(int size) {
	this.arr = new int[size];
	this.topOfQueue = -1;
	this.beginingOfQueue = -1;
	System.out.println(" the queue is succesfully inited "+size);	
}

public boolean isFull() {
	if(topOfQueue==arr.length-1){
		return true;
	}else {
		return false;
	}
}

public boolean isEmpty() {
	if(beginingOfQueue==-1 || beginingOfQueue==arr.length){
		return true;
	}else {
		return false;
	}
}

public void enQueue(int value) {
	if(isFull()) {
		System.out.println(" queue is full");
	}else if(isEmpty()){
		//return false;
		beginingOfQueue = 0;
		topOfQueue++;
		arr[topOfQueue] = value;
		System.out.println(" successfully inserted "+ value);
	}else {
		topOfQueue++;
		arr[topOfQueue] = value;
		System.out.println(" successfully inserted "+ value);
	}
}

public int deQueue() {
	if(isEmpty()) {
		System.out.println(" queue is empty");
		return -1;
	}else {
		//return false;
		int result = arr[beginingOfQueue];
		beginingOfQueue++;
		if(beginingOfQueue > topOfQueue) {
			beginingOfQueue = topOfQueue = -1;
		}
		return result;
		
	}
}

public int peek() {
	if(!isEmpty()) {
		return arr[beginingOfQueue];
	}else {
		System.out.println(" queue is empty");
		return -1;
	}
}

public void delete() {
	arr=null;
	System.out.println(" queue is deleted");
}


}
