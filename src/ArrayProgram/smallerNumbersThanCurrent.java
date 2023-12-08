package ArrayProgram;

public class smallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Question = {32,14,55,26,12,57,69,13,11,52,04,96};
		int[] res = smallerNumbersThanCurrent(Question);
		
		for(int i =0;i<res.length;i++){
			System.out.print(","+res[i]);
			
		}
	}
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
	        int arrayNew[]; 
	        arrayNew = new int[nums.length];
	      //  System.out.println("sd");
	        for(int i =0;i<nums.length;i++){
	            int maxCount = 0;
	            for(int j =0;j<nums.length;j++){
	                if(nums[i] > nums[j]){
	                    maxCount++;
	                }
	            }
	            arrayNew[i] =maxCount;
	        }

	        return arrayNew;
	    }

}
