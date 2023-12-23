package ArrayListImp;

public class LeftRightDiff {
    public static void main(String[] args) {
        int[] obj = leftRightDifference(new int[]{1});
    }
    public static int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] newArray = new int[len];

        for(int i=0;i<len;i++){
            int leftSum =0;
            int rightSum =0;
            int start=i+1;
            while(start<len){
                leftSum = leftSum+nums[start];
                start++;
            }
            int end=0;
            while(end<i){
                rightSum = rightSum+nums[end];
                end++;
            }
            newArray[i] = Math.abs(leftSum-rightSum);

        }
        for (int a: newArray){
            System.out.println(a);
        }

        return newArray;

    }
}
