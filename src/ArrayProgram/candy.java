package ArrayProgram;

public class candy {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        int len =arr.length;
        for(int i=0;i<len;i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        for(int i=1;i<len;i++){

            if(arr[i-1]>arr[i]){
                arr[i-1]=arr[i-1]+1;
            }else if(arr[i-1]<arr[i]){
                arr[i]=arr[i]+1;
            }

            if(arr[i-1]==arr[i]){
                if(arr[i-1]>1){
                    arr[i]=arr[i]-1;
                }else{
                    arr[i]=arr[i]+1;
                }
            }
        }
        int a=0;
        for(int n : arr){
            a+=n;
        }
        System.out.println(a);
    }
}
