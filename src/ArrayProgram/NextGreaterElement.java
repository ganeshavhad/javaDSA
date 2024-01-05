package ArrayProgram;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3};
        int max = 0;
        for (int n: array) max = Math.max(max,n);
        int [] resultArr = new int[array.length];
        int k=0;
        for (int i=0;i<array.length;i++){
            Boolean isLess=true;
            for (int j=i+1;j<array.length;j++) {
                if(array[i]<array[j]){ isLess=false;
                    resultArr[k++] =array[j]; break;
                }
            }
            if(array[i]==max && isLess==true){resultArr[k++]=-1;}
            else { if(isLess) { resultArr[k++]=max; } }
        }

        for (int r:resultArr){
            System.out.println(r);
        }
    }
}
