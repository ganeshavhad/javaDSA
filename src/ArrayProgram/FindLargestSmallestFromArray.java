package ArrayProgram;

public class FindLargestSmallestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] MyNum = {10,2,4,2,3,6,8,9,12,99};
		int C  = MyNum.length;
		int largest = MyNum[0];
		int smallest = MyNum[0];
		for(int i =0;i<C;i++) {
			if(MyNum[i] > largest) {
				largest= MyNum[i];
			}
		}
		for(int k =0;k<C;k++) {
			if(MyNum[k] < smallest) {
				smallest= MyNum[k];
			}
		}
		
		System.out.println(" smallest number is "+smallest);
		System.out.println(" largest number is "+largest);
	}

}

