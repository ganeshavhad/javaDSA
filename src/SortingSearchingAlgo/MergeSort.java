package SortingSearchingAlgo;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arg = {2,4,5,7,1,8,6,9,3};
		int[] res = mergeSort(arg);
		BinarySearch obj = new BinarySearch();
		int resOut = obj.serach(res,9);
		System.out.println("middle :"+resOut);
	}
	
	public static int[] mergeSort(int[] arg) {
		
		return arg;
	}
	
	public static void printArray(int[] arg) {
		
		for(int i =0;i<arg.length;i++) {
			System.out.print(","+arg[i]);
		}
		System.out.println(" before sort :");
	}


}
