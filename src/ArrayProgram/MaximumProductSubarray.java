package ArrayProgram;

public class MaximumProductSubarray
{
    public static void main(String[] args) {
        int[] nums = {0,2}; //0,2
        //if(a.length==1){ return a[0];}
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        int temp;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<0) {
                temp = max;
                max = min;
                min = temp;
            }
            max = Integer.max(nums[i],nums[i]*max);
            min = Integer.min(nums[i],nums[i]*min);
            ans = Integer.max(ans,max);
        }
        System.out.println(ans);

    }
}
