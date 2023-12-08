package SortingSearchingAlgo;

public class BubbleSorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arg = {2,4,5,7,1,8,6,9,3};
		int[] res = BubbleSort(arg);
		BinarySearch obj = new BinarySearch();
		int resOut = obj.serach(res,9);
		System.out.println("middle :"+resOut);
	}
	
	public static int[] BubbleSort(int[] arg) {
		printArray(arg);//.toString());
		int k =0;
		for(int i =0;i<arg.length-1;i++) {  // iterate loop from first to end
			for(int j =0;j<arg.length-i-1;j++) {
				if(arg[j]>arg[j+1]) {
					int temp = arg[j];
					arg[j] = arg[j+1];
					arg[j+1] = temp;
					
				}
				k++;
			}			
		}
		System.out.println("k=="+k);
		printArray(arg);
		return arg;
	}
	public static void printArray(int[] arg) {
		
		for(int i =0;i<arg.length;i++) {
			System.out.print(","+arg[i]);
		}
		System.out.println(" before sort :");
	}
}
