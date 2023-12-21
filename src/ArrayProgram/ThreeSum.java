package ArrayProgram;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,7,9};
        List<List<Integer>> res = threeSum(nums);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> numsA =new HashSet<>();

        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    numsA.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    right--; left++;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
       return new ArrayList<>(numsA);

    }
}
