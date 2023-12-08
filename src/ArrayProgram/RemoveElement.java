package ArrayProgram;

public class RemoveElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,2,3,2,3,2,1,6,2,7,4,9};
		int a = removeElement(nums,2);
	
	}
	
	public static int removeElement(int[] nums, int val) {
	       // int k =0;
	        int a =0;
	        int x = nums.length;
	       // int[] numsA = new int[nums.length];
	        for(int i =0;i<nums.length;i++){
	            if(nums[i]!=val){ nums[a] = nums[i]; a++; }
	        }
	        for(int i =a;i<x;i++){
	             nums[i]=0;
	        }
	        for(int i =0;i<nums.length;i++){
	            //if(nums[i]!=val){ nums[a] = nums[i];a++; }
		        System.out.print(nums[i]+",");
	        }
	        

	        return a;
	    }
}
