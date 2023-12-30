package ArrayProgram;

public class canCompleteCircuit {

    public static void main(String[] args) {

        int gas[] = {4,5,2,6,5,3};
        int cost[] = {3,2,7,3,2,9};
        int res=-1;
        for(int i=0;i<gas.length;i++){
            if(gas[i]>=cost[i]){
              res = validRoute(gas,cost,i);
              if(res>=0){
                  System.out.println(i);
                  break;
              }
            }
        }
        System.out.println(res);
    }

    public static int validRoute(int[] gas,int[]cost,int index) {
        int remainGas=0;
        int n = gas.length;
        //int startI=index;
        for(int i=0;i<gas.length;i++){
            remainGas = (remainGas+gas[index])-cost[index];
            index = ++index % n;
            if(remainGas<0){ return remainGas;}
        }

        return remainGas;
    }


}
