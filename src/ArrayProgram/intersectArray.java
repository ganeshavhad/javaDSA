package ArrayProgram;

import java.util.Arrays;

public class intersectArray {

    public static void main(String[] args) {
         int[]var1= {3,4,6};
         int[] var={3,4,5,6};
        int[] res= intersectSolution(var1,var);
        for (int n: res){
            System.out.println(n);
        }
    }

    public static int[] intersectSolution(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while( i < l1 && j < l2)
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else
            {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
