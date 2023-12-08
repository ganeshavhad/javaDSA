package ArrayProgram;

import java.util.HashSet;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,1,0,7,4,7,6,2};
		
		int[] r = duplicateNumber(arr);
	}

	static int[] duplicateNumber(int[] arr) {
	    // TODO
	//int n =0;
	int unique[] = new int[arr.length];
	HashSet<Integer> one = new HashSet<Integer>();
    for(int i=0;i < arr.length;i++){
    	one.add(arr[i]); 
    }
    int a=0;
    for(Integer abc:one){
    	//System.out.println("first ="+abc);
    	unique[a]=abc; a++;
    }
    return unique;
  }
}
