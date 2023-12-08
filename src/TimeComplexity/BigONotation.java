package TimeComplexity;

public class BigONotation {
	public static void main(String[] args) {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("beforeUsedMem = "+beforeUsedMem);
		printNumber(20);  // O(n2) notation == quadratic runtime
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("afterUsedMem = "+afterUsedMem);
		
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		
		System.out.println("actualMemUsed = "+actualMemUsed);
		//5936240
		//7216296
	}
	
	public static void printNumber(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//int k=0;
				for(int k=0;k<n;k++) {
					System.out.println("i="+i+"  j="+j+"  k="+k);
				}
			}			
		}
	}
	
}

