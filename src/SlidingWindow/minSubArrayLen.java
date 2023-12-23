package SlidingWindow;

public class minSubArrayLen {
    public static void main(String[] args) {
        int[] nums= {2,3,1,2,4,3};
        int target = 29;
        int start=0; int minLen=Integer.MAX_VALUE;;
        int len=nums.length;
        int sum = 0;//Integer.MAX_VALUE;
        for(int i=0; i < len;i++){
            sum+=nums[i];
            while(sum>=target){
                minLen=Math.min(minLen,1+i-start);
                sum-=nums[start];
                start++;
            }

        }
       if(minLen == Integer.MAX_VALUE) {minLen= 0 ;}
        System.out.println(minLen);

    }
}
