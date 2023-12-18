package ArrayProgram;

public class maxWater {
    public static void main(String[] args) {
        int[] var = {2,3,4,5,18,17,6};
        int res= solution(var);
        System.out.println(res);
    }

    public static int solution(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxWater=0;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){

            if(arr[left]<arr[right]){
                sum = (right-left)*arr[left];
                left++;
            }else{
                sum = (right-left)*arr[right];
                right--;
            }
            maxWater = Math.max(maxWater,sum);
        }
        return maxWater;
    }
}
