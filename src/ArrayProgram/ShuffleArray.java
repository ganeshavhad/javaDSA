package ArrayProgram;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n=2;
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        for(int i:result){
            //System.out.println(i);
        }
        moveZeros();
    }

    public static  void  moveZeros(){
        int[] nums={0,1,0,3,12};
        for(int i=0;i<nums.length-1; i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }

        for (int i:nums){
            System.out.println(i);
        }
    }
}
