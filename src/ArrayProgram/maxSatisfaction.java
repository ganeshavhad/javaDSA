package ArrayProgram;

import java.util.Arrays;

public class maxSatisfaction {
    public static void main(String[] args) {
        int[] que = {-1,-8,0,5,-7};

        Arrays.sort(que);
        int res=0; int preSum=0;

        for (int n: que){
            System.out.println(n);
        }

        for (int i=que.length-1;i>=0;i--){
            preSum += que[i];
            if(preSum<0){ break;}
            res = preSum+res;
        }
        System.out.println(res);
    }
}
