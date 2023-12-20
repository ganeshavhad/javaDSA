package ArrayProgram;

public class missingNumber {
    public static void main(String[] args) {
        int[] array={0,1,4,2};
        int k = findMissing(array);
        System.out.println(k);
    }

    public static int findMissing(int[] array){
       // int maxNumber=array[0];
        Boolean missNum=true;
        int maxNumber=array.length;

        while(maxNumber>0) {
            missNum=true;
            for(int k =0; k<array.length; k++) {
                if(maxNumber==array[k]){ missNum=false; break;}
            }
            if(missNum==true){ return maxNumber;}
            maxNumber--;
        }

        return maxNumber;

    }
}
