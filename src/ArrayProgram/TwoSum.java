package ArrayProgram;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int r[] ={1,1,2,3,4,5,5,7,8,9,9,9};//,3,4,2,3,5,6,6};
		sum(new int[] {1,2,7,8,6},9);
	}
	
	public static int sum(int[] nums,int target) {
		 if (nums.length == 0) {
	            return 0;
	        }
	 
	        //int i = 0;
	 
	        for (int j = 0; j < nums.length; j++) {
	        	for (int i = 0; i < nums.length; i++) {
	        		 if (nums[j] + nums[i]==target) {
	        		   System.out.println(i+" ,"+j); break;
	        		 }
	        	 }
	        }
	 
	        //return i + 1;
		// System.out.println(i+1);
		 return 1;
//		
	
	}

}
