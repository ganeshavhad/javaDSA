package Recursion;

//Question : how to find sum of digit of positive integer number  using recursion
//ex . 10 ans 1
//ex 54 ans 9
// ex 112 : 112/10 = 11 reminder 2
//			11/10 = 1 reminder 1
// 112 ans 4
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigit mainObj = new SumOfDigit();
		var num = mainObj.SumOfDigit(1132);
		System.out.println(num);
	}

	public int SumOfDigit(int n) {
		if (n == 0 || n < 0) {
			return 0;
		}
		return n % 10 + SumOfDigit(n / 10);
	}
}
