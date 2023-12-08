package ArrayProgram;

public class findTopTwoScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiArray[]= {1,2,3,4,5,6,7,8,9};
	
		findTopTwoScores(multiArray);
	}
	
	public static int[] findTopTwoScores(int[] array){
	    // TODO
		if(array.length <= 2) { return new int[0]; }
		int res[]= {0,0};
		int first = 0;
		int second =0;
//		if(array[0]>=array[1]) {
//			 first=array[0];
//			 second = array[1];
//		}else {
//			 first=array[1];
//			 second = array[0];
//		}
		
		for(int i =2;i<array.length;i++) {
		  if (array[i] > first) {
			  second = first;
		      first = array[i];
		   }else if (array[i] > second && array[i] < first) {
			   second = array[i];
		   }		  
		}
		res[0] = first;
		res[1] = second;
		System.out.println("first ="+res[0]+ " secodn ="+res[1]);
		return res;
	  }

}
