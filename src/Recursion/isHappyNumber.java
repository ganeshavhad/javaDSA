package Recursion;

public class isHappyNumber {
    public static void main(String[] args) {
        isHappyNum(19);
    }

    public static Boolean isHappyNum(int num){
        if(num==1){ return true;}
        int sum=0;
       // while(num>1){

            sum = num%10 * num%10;
            num = num/10;
            if(sum==num) return false;
            isHappyNum(num);
       // }
        System.out.println(sum);
        return sum==1;
    }
}
