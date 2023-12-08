package ArrayProgram;

public class RemoveFirstLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,3,12,23};
		int arrayRes[];
		
		arrayRes = middle(array);
		 for(int i=0;i<arrayRes.length;i++){
			 System.out.print( arrayRes[i] + ",");
			}
	}
	
	public static int[] middle(int[] array) {
		int l = array.length;  
		if (l <= 2) {
	            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
	        }
	 
	        // Create a new array with a size of the input array length minus 2
	        int[] middleArray = new int[array.length - 2];
	 
	        // Copy the elements from the input array, excluding the first and last elements
	        int index = 1;
	        while (index < array.length - 1) {
	            middleArray[index - 1] = array[index];
	            index++;
	        }
	       
	        for(int i =1;i<l-1;i++) {
	        	middleArray[i-1] = array[i];
	         }
        
        return middleArray;
    }

}
