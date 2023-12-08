package Recursion;

import java.util.List;

public class recursionByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(5);
		System.out.println(" hello eclipse");
		List one;	
		String namemm="ganehs";
		System.out.println(namemm);
		
	}
	
	public static void calculate(int value) {
		
		int newV = value-1; 
		System.out.println(" current value: " + value);
		
		if(newV>0) {
			
			calculate(newV);
		}
	}

}
