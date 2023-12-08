package PatternPrint;

public class TranglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		halfTriangle(n);
		triangleReversePattern(n);
		trianglePattern(n);
		numberReverseTringle(n);
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		numberTree(n);
		numberSameTriangle(n);
		
	}
	
	public static void halfTriangle(int n) {
		  for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(j<=i){
	                    System.out.print("*"+" ");
	                }
	            }
	            System.out.println();
	        }
	        for(int i=n-1;i>0;i--){
	            for(int j=1;j<=n;j++){
	                if(j<=i){
	                    System.out.print("*"+" ");
	                }
	            }
	            System.out.println();
	        }
	}
	
	public static void triangleReversePattern(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int f=0;f<=(2*n)-(2*i+1);f++) {
				System.out.print("*");
			}
			
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
							
			System.out.println("");
		}
	}
		public static void trianglePattern(int n) {
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-i-1;j++) {
					System.out.print(" ");
				}
				
				for(int f=0;f<2*i+1;f++) {
					System.out.print("*");
				}
				
				for(int k=0;k<n-i-1;k++) {
					System.out.print(" ");
				}
								
				System.out.println(" ");
			}
		}	
	
	
	public static void numberReverseTringle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	
	public static void numberTree(int n) {
	
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void numberSameTriangle(int n) {
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

}
