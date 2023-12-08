package Recursion;

// GCD is largest positive number that divide the number with 0 remainder
//ex gcd(4,8) = 4
//ex gcd(12,24) = 6
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gcd(12,28);
		int[] a={36,8,6,7,12};
		System.out.println(gcdArray(a));
		System.out.println(gcd(120,28));
		System.out.println(gcdA(120,60));

	}
	
	public static int gcdArray(int[] a) {
		if(a.length==0) {
			return 1;
		}	
		
		int lower = a[0];
		int higher = a[1];
		if(lower>higher) {
			lower = higher;
			higher = lower;
		}
		
		for(int i =0;i<a.length;i++) {
			if(lower<=a[i]) {
				lower = a[i];
			}
			if(higher>=a[i]) {
				higher = a[i];
			}
		}
		
		int gcd=1;
		
		for(int i =1;i<=lower;i++) {
			if(lower%i==0 && higher%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static int gcd(int a,int b) {
		if(a<0 || b<0) {
			return 1;
		}
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	
	public static int gcdA(int a ,int b) {
		if(a<0 || b<0) {
			return 1;
		}
		if(a%b==0 ) {
			return b;
		}
		if(b%a==0 ) {
			return a;
		}
		
		int lower = b;
		int higher = a;
		if(a<b) {
			lower = a;
			higher = b;
		}
		int gcd=1;
		for(int i =1;i<=lower;i++) {
			if(lower%i==0 && higher%i==0) {
				//System.out.println("i=="+i);
				gcd=i;
			}
		}
		return gcd;
	}

}
