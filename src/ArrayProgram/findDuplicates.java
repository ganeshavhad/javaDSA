package ArrayProgram;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,4,5,5,6,7,7,8};
        List<Integer> list = new ArrayList<>();
        int[] res=new int[arr.length/2];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    list.add(arr[i]);break;
                }
            }
        }
        int[] resA=new int[k];
        k=0;
        for (int n:res){
           if(n>0){ resA[k]=n; k++; }
        }

    }
}
