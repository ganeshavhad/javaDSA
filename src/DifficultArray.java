
public class DifficultArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,0,3,0,9,4,6,7};
		findMissing(a);
	}
	
	public static int[] findMissing(int[] args) {
		
		int[] res = new int[9];
		for(int j=1;j<=9;j++) {	
			Boolean intPresent =true;
			for(int i=0;i<args.length;i++) {
				if(j==args[i]) {
					intPresent=false; break;
				}
			}
			if(intPresent){ 
				System.out.println(j);
			} 
			
		}
			//if(args[i])
		return res;
	}

}
