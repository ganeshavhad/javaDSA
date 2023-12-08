package ArrayProgram;

public class findMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,9,1,0,3,4,7,6,8};
		int[] arrSorted = {1,2,4,7,6,8};
		int r = missingNumber(arr);
		int a = findMissingNumberInArr(arrSorted);
		System.out.println(r);
		System.out.println(a);
	}
	static int findMissingNumberInArr(int[] arr) {
		    // TODO
		int n =0;
	    for(int i=0;i < arr.length-1;i++){
	    	System.out.println("i : "+i);
		     if(arr[i]+1 != arr[i+1]) {
		    	 //System.out.println("i == "+i+ " ="+arr[i]);
		         n = arr[i] + 1; break;
		     }  
	    }
	    return n;
	  }
	// for unsorted array 
	 public static int missingNumber(int[] nums) {
	       int n = nums.length;
				 int totalSum = n*(n+1)/2; //12/2 = 6
				 for(int i =0;i<n;i++){
					 totalSum -= nums[i];
				 }
				 return totalSum;
	    }
	
	
}
