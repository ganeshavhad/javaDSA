package SortingSearchingAlgo;

public class InsertionSort {
	
	public static int insertionSort(int[] arg) {
		Main obj =  new Main();
		obj.printArray(arg);//.toString());
		
		for(int i =1;i<arg.length;i++) {  // iterate loop from first to end
			//int minimumIndex = i;
			int temp = arg[i],j = i;
			while(j > 0 && arg[j-1]>temp) {
				arg[j] = arg[j-1];
				j--;
			}
			arg[j]=temp;			
		}

		//int arrs[10]; // Store integer elements
		//String arrs[5];
		obj.printArray(arg);
		return 1;
	}
}

//array
//sll
//ll
//stack
//queue
//arraylist
//recursion

