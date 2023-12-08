package ArrayProgram;

import java.util.Scanner;

public class AvarageTemparature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println(" How many day  :");
		int totalDays = console.nextInt();
		int sum =0;
		int tempArray[];
		tempArray = new int[totalDays]; //totalDays);// = {}(totalDays);
		for(int i =0; i< totalDays;i++) {
			System.out.println(i+" days temparatue = ");
			int temp = console.nextInt();
			tempArray[i] = temp;
			sum += temp ;
		}
		
		double averageTemp = sum / totalDays;
		System.out.println(" average temparatue = "+averageTemp);
		
		for(int i =0; i< totalDays;i++) {
			if((int) averageTemp < tempArray[i] ) {
			 System.out.println(tempArray[i]);
			}
		}
		
	}

}
