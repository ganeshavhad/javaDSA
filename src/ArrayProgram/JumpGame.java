package ArrayProgram;

public class JumpGame {
    public static void main(String[] args) {
        int[] question = {2,3,0,1,4,5,2};
       Boolean a=  solution(question);
        System.out.println(a);
       int b = jump2(question);
        System.out.println("max jump 2=="+b);
    }
    public static int jump2(int[] nums) {
        int len= nums.length;
        int maxReach=0;
        int sum=0;
        if(maxReach>nums.length){ return 1;}

        for(int i=0;i<len;i++){
            sum=sum+nums[i];
            maxReach=Math.max(maxReach,sum);
            if(maxReach>=len){ return i+1; }
        }
        return len;
    }
    public static Boolean solution(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;

        //return true;

    }
}
