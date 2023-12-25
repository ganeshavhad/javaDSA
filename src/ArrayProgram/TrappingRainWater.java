package ArrayProgram;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] question = {0,1,0,2,1,0,1,3,2,1,2,1};

        int max=0;
        int prevMax=0;

        int start = 0;
        int end =1;
        for(int i=1;i< question.length;i++){
            if(question[start] <= question[end] && start-end>1){
                prevMax += question[i] - Math.min(question[start],question[end]);
                start=end;
            }
            end++;
        }


        System.out.println(prevMax);
    }
}
