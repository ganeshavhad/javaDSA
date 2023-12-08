package ArrayProgram;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if two array has same element place at different position then it call permutaion
		// to know this calculate sum of array and product of array  if this match with each other then it is permutation
		int one[] = {2,3,1,4,5,7,6,8,9};
		int two[] = {1,2,3,2,5,4,7,9,8};
		// sum of array
		int sumA = sumOfArray(one);
		int sumB = sumOfArray(two);
		
		int productA = productOfArray(one);
		int productB = productOfArray(two);
		
		if(sumA==sumB && productA==productB) {
			System.out.println(" permutaion array");
		}else {
			System.out.println(" non permutaion array");
	
		}
	}
	public static int sumOfArray(int[] nums) {
		int sum =0;
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
		}
		return sum;
	}
	public static int productOfArray(int[] nums) {
		int sum =0;
		for(int i=0;i<nums.length;i++) {
			sum = sum * nums[i];
		}
		return sum;
	}

}
