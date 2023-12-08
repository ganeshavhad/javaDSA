package StringProblem;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "{} asd <p> test here </p>";
		
		String[] argsA = {"A","BE","C"};
		String[] argsB = {"AB","B","EC"};
		
		Boolean var = stringConcatantion(argsA,argsB);
		System.out.println(" Both array conatain same value == "+var);
		if(argsA.length==argsB.length) {
			for(int i=0;i<argsA.length;i++) {
				if(argsA[i]!=argsB[i]) {
					System.out.println(" failed");
				}else {
					System.out.println(" success");
				}
			}
		}else {
			System.out.println(" failed");
		}
	}
	
	public static boolean stringConcatantion(String[] argsA,String[] argsB) {
		
		if(argsA.length==argsB.length) {
			StringBuilder A = new StringBuilder();
			StringBuilder B = new StringBuilder();
			for(int i=0;i<argsA.length;i++) {
				A.append(argsA[i]);
				B.append(argsB[i]);
			}

			if(A.toString().equals(B.toString())) {
				return true;
			}else {
				return false;	
			}
		}else {
			return false;
		}
		
	}
}
