package Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int res = 	factorialResult(4);
			System.out.println(res);
	}
	public static int factorialResult(int num) {
		
		if(num==0) {
			return 1;
		}
		if(num-1==0) {return num;}
		//int res = 0;
		//while(num>0) {
			System.out.println(num);
			return num * factorialResult(num-1);
		//}
		//return res;
	}

}
