package CollectionList;

public class forLoopDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MB = 1024*1024;

	    //Getting the runtime reference from system
	    Runtime runtime = Runtime.getRuntime();

	    //Print used memory
	    System.out.println("Used Memory:" 
	        + (runtime.totalMemory() - runtime.freeMemory()) / MB);

	    //Print free memory
	    System.out.println("Free Memory:" 
	        + runtime.freeMemory() / MB);

	   
		int k =0;
		for(int i =0;i<4;i++) {
			for(int j =0;j<4;j++) {
				if(1==j) {
					//break;
				}
				k++;
			}
			for(int j =0;j<4;j++) {
				if(1==j) {
					//break;
				}
				k++;
			}
			for(int j =0;j<4;j++) {
				if(1==j) {
					//break;
				}
				k++;
			}
		}
		 //Print total available memory
	    System.out.println("Total Memory:" + runtime.totalMemory() / MB);

	    //Print Maximum available memory
	    System.out.println("Max Memory:" + runtime.maxMemory() / MB);
	    
		System.out.println("value"+k);
	}

}
