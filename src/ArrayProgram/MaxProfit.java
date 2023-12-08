package ArrayProgram;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,2,3,1,6,7,4,9};
		int maxProfit = 0;
		int minAmount = nums[0];
		for(int numbers:nums) {
			if(minAmount > numbers) {
				minAmount = numbers;
			}
			if(numbers-minAmount > maxProfit) {
				maxProfit = numbers-minAmount; 
			}
		}
		System.out.println(maxProfit +" "+ minAmount);
	}

}
