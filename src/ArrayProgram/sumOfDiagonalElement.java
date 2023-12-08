package ArrayProgram;

public class sumOfDiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiArray[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		sumDiagonalElements(multiArray);
	}
	
	public static int sumDiagonalElements(int[][] array) {
        
		int l = array.length;
		int sum =0;
		for(int i =0; i<l; i++) {
			for(int j =0; j<l; j++) {				
				if(1==j) { sum += array[i][j];}
			}
			
		}
		System.out.println(sum);
		return sum;
    }


}
