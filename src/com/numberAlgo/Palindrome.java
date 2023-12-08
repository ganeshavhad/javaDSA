package com.numberAlgo;

public class Palindrome {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		
		 int rev = 0, sum=0 , x=999;
		   int temp=x;
		        while(x>0){
		            rev = x%10;
		            sum = (sum*10)+rev;
		            x = x/10;
		        }
		        if(rev==temp){ 
		            return true;
		        }else{
		            return false;
		        }
	}

}
