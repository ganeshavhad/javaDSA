package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowClass {

    public static void main(String[] args) {
        int[] num= {1,2,1,2,1,2,1,2};
        int k=1;
        Map<Integer,Integer> numsCount= new HashMap<Integer,Integer>();
        int Start=0;//, end=0;
        int ans=0;
        for(int i=0;i<num.length;i++){
            numsCount.put(num[i], numsCount.getOrDefault(num[i],0)+1);
            while(numsCount.get(num[i])>k){
                numsCount.put(num[i], numsCount.getOrDefault(num[i],0)-1);
                Start++;
            }
           // end++;
            ans=Math.max(ans,Start-i+1);
        }
        System.out.println(ans);

    }
}
