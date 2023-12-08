package ArrayProgram;

public class RotateMatrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] nums= {{1,2,3},{5,6,7},{2,3,4}};
	Boolean res = matrix(nums);
	System.out.println(res);
	}
	
	public static Boolean matrix(int[][] num) {
		if(num.length==0 || num.length!=num[0].length) {
			return false;
		}
		
		return true;
	}

	
}
