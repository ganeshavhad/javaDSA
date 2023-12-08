package PatternPrint;

public class squarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareAPattern(3);
	}

	
	
public static void squareAPattern(int n) {
		
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
		for(int i=0;i<n;i++) {
					
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int f=0;f<(2*n)-(2*i+1);f++) {
				System.out.print("*");
			}
			
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
							
			System.out.println("");
										
			
		}
	}

}
