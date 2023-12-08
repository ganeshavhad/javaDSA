package ArrayProgram;

public class maxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,2,3,1,6,7,4};
		int maxProduct = nums[0]*nums[1];
		//int minAmount = nums[0]*nums[1];
		for(int numbers:nums) {
			for(int numbersTwo:nums) {
				if(maxProduct < numbers*numbersTwo) {
					maxProduct = numbers*numbersTwo;
				}
			}
			
		}
		System.out.println(maxProduct +" maxProduct");
	}

}
