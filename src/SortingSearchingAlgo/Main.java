package SortingSearchingAlgo;

public class Main {

	public static void main(String[] args) {

			// TODO Auto-generated method stub
			int[] arg = {2,4,5,7,1,8,6,9,3};
			//int[] res = SelectionSort(arg);
			InsertionSort objI = new InsertionSort();
			System.out.println(" insertion sort :");
			objI.insertionSort(arg);
			SelectionSort obj = new SelectionSort();
			System.out.println(" selection sort :");
			int resOut = obj.selectionSort(arg);
			System.out.println("middle :"+resOut);
		
	}
public static void printArray(int[] arg) {
		
		for(int i =0;i<arg.length;i++) {
			System.out.print(","+arg[i]);
		}

	}

}
