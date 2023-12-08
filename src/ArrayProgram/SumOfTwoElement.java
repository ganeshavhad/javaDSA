package ArrayProgram;

public class SumOfTwoElement {

	public static int[] twoSum(int[] nums, int target) {
		int ArrLength = nums.length;
		int arrIndex[] = new int[2];

		for (int i = 0; ArrLength - 1 > i; i++) { // 1 , 2 ,3

			for (int j = i + 1; ArrLength > j; j++) {

				if (nums[i] + nums[j] == target) {
					arrIndex[0] = i;
					arrIndex[1] = j;
					System.out.println("i==" + i + " j=" + j);
					break;
					//
				}
			}

		}
		return arrIndex;
	}

	public static void main(String[] args) {
		System.out.println("i==test");
		int arrX[] = { 1, 3 };// {2,3,5,8,4,10,15,17,89,34,78};
		int Result[];
		// Result = twoSum(arrX,10);

		int ResultA = searchInsert(arrX, 3);
		System.out.println("ResultA==" + ResultA);

	}

	public static int searchInsert(int[] nums, int target) {

		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return c;
			}
			if (nums[i] < target) {
				c++;
			}
		}
		return c;
	}

}
