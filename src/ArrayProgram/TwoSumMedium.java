package ArrayProgram;

public class TwoSumMedium {
    public static void main(String[] args) {
        int[] var = {2,3,4,5,7,9};
        int target =16;
       int[] res= res(var,target);

        for (int a: res){
            System.out.println(a);
        }
    }
    public static int[] res(int[] var,int target){
        int len = var.length;
        int start=0;
        int end=len-1;

        int[] res = new int[2];
        while(start<end){
            if(var[start]+var[end]<target){
                start++;
            }else if(var[start]+var[end]>target){
                end--;
            }else{
                res[0]=start+1;
                res[1]=end+1;
                return res;
            }
        }
        return res;
    }
}
