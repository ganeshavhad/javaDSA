package ArrayProgram;

public class PermutationPossiblePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int res[] =	test(new int[] {1,2,7,8,6});
	}
	
	public static int[] test(int[] nums) {
		int res[] = {1,2};
		int L=0;
		  for (int j = 0; j < nums.length; j++) {
	        	for (int i = 0; i < nums.length; i++) {
	        		System.out.println(" pairs :"+ nums[i]+ " ,"+ nums[j]); 	
	        		//res = {nums[i],nums[j]};
	        		L++;
	        	}
		  }
		  System.out.println(" pairs :"+L);
		  return res;
		
	}
}
