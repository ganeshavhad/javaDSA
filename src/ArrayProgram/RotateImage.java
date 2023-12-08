package ArrayProgram;

 public class RotateImage {
/*
 * Q 1 2 3   Ans 7 4 1
 *   4 5 6		 8 5 2
 *   7 8 9		 9 6 3
 *
 */
	// solution on youtube : https://www.youtube.com/watch?v=SA867FvqHrM&ab_channel=NickWhite
public static void main(String[] args) {
	int[][] nums = {
			{ 1,2,3,11},
			{ 4,5,6,12},
			{ 7,8,9,13},
			{21,22,23,24}
	};
	int[][] numA = {
			{1,2},
			{3,4}
	};
boolean res = rotateMatrix(nums);
}

public static boolean rotateMatrix(int[][] matrix) {
if(matrix.length ==0 || matrix.length!= matrix[0].length) return false;

int size = matrix.length;
int first =0;
int last = size-1;

for(int n =0;n<size;n++) {
	for(int j =0;j<size;j++) {		
		System.out.print("->"+matrix[n][j]);
	}
	System.out.println(" ");
}
	
	int temp = matrix[first][first];
	matrix[first][first] = matrix[last][first];
	matrix[last][first] = matrix[last][last];
	matrix[last][last] = matrix[first][last];
	matrix[first][last] = temp;

 first =0;
 last = size-1;
 int middle = size/2;
 	temp = matrix[first][middle]; // 01
	matrix[first][middle] = matrix[middle][first]; // 10 -> 01	
	matrix[middle][first] = matrix[last][middle]; //21 ->
	matrix[last][middle] = matrix[middle][last]; //12 -> 21	
	matrix[middle][last] = temp; 
	System.out.println(" after swap middle :");

	for(int n =0;n<size;n++) {
		for(int j =0;j<size;j++) {		
			System.out.print("->"+matrix[n][j]);
		}
		System.out.println(" ");
	}
	
	return true;
}
	
}
