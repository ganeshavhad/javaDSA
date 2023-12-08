package SortingSearchingAlgo;

public class SelectionSort {
	
	public static int selectionSort(int[] arg) {
		Main obj =  new Main();
		obj.printArray(arg);//.toString());
		
		for(int i =0;i<arg.length-1;i++) {  // iterate loop from first to end
			int minimumIndex = i;
			for(int j =i+1;j<arg.length;j++) {
				if(arg[j] < arg[minimumIndex]) {
					minimumIndex = j;
				}
			}	
			if(minimumIndex!=i) {
				int temp = arg[i];
				arg[i] = arg[minimumIndex];
				arg[minimumIndex] = temp;
			}
		}

		obj.printArray(arg);
		return 1;
	}
}
