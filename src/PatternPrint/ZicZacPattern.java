package PatternPrint;

public class ZicZacPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		printNumber(n);
		printTriangle(n);
		halfTriangle(n);
		
	}
	
	public static void printNumber(int n) {
		int a =1;
		for(int i =1;i<n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println(" ");
		}
	}
public static void halfTriangle(int n) {
	int k=1;
	for(int i =0;i<n;i++) {
	    if(i%2==0) { 
			k = 1;
		 }else {
			k = 0;
		 }
		for(int j=0;j<=i;j++) {
			System.out.print(k+" ");	
				k=1-k;
			}
			System.out.println("");
		}
	}

public static void printTriangle(int n) {
    // code here
     for (int i=1;i<=n;i++){
          //number
        for (int j =1;j<=i;j++){
            System.out.print(j+" ");
        }
        //space
        for (int j=1;j<=2*(n-i);j++){
            System.out.print("  ");
        }
        //number
        for (int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

}
