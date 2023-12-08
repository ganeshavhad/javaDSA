package ArrayProgram;

public class RemoveDuplicatesRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r[] ={1,1,2,3,4,5,5,7,8,9,9,9};//,3,4,2,3,5,6,6};
		removeDuplicates(r);
	}
	
	public static int removeDuplicates(int[] nums) {
		 if (nums.length == 0) {
	            return 0;
	        }
	 
	        int i = 0;
	 
	        for (int j = 1; j < nums.length; j++) {
	            if (nums[j] != nums[i]) {
	                i++;
	                nums[i] = nums[j];
	            }
	        }
	 
	        //return i + 1;
		 System.out.println(i+1);
		 return i+1;
//		
	
	}
}
