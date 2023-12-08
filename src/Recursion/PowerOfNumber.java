package Recursion;

//Calculate power of given number
// ex 2*2*2 = 8
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int QuestionNum = 7;
		int Power = 5;
		
		PowerOfNumber calculateNum = new PowerOfNumber();
		int Res = calculateNum.calculate(QuestionNum,Power);
		System.out.println(Res);
	}
	
	public int calculate(int QuestionNum,int Power){
		if(Power<=0 ) {
			return 1;
		}
		return QuestionNum * calculate(QuestionNum,Power-1);
	}
}
