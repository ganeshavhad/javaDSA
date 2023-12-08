package ArrayProgram;

public class FindMinimumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Question = {32,14,55,26,12,57,69,13,11,52,04,96};
		int Res = MinVal(Question);
		System.out.println(Res);
		MaximumVal(Question);
		
		//get array in return
		int arr[]=get();  
		//printing the values of an array  
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);  
		
	}
	
	public static int MinVal(int[] numb) {
		int minNum = numb[0];
		for(int i=1;numb.length > i;i++)
			if(numb[i]<minNum) {
				minNum = numb[i];
			}
		
		return minNum;
	}
	
	static void MaximumVal(int[] numb) {
		int minNum = numb[0];
		for(int i=1;numb.length > i;i++)
			if(numb[i]>minNum) {
				minNum = numb[i];
			}
		
		System.out.println(minNum);
	}
	
	static int[] get(){  
		return new int[]{10,30,50,90,60};  
	}  
	
}
