import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Revision {

    public static void main(String[] args) {
        PrimeNumber(100);
    }

    public static void PrimeNumber(int  args) {
        int[] primeNumber = new int[args/2];
        int n=0;
        for(int i =2;i<args;i++){
            Boolean isNotPrime=false;

            for(int j=2; j <= i/2; j++){
                if(i%j==0 && i!=j){
                    isNotPrime=true; break;
                }
            }
            if(isNotPrime==false){
                primeNumber[n++]=i;
            }
        }

        for (int p: primeNumber){
            System.out.println(p);
        }

    }

    public static void PrimeNumberUsingSieve(int  args) {
        Map<Integer,Boolean> NonSquareRoot = new HashMap<>();
        for(int i=2;i<=args;i++){
            if (NonSquareRoot.get(i) == null) {
                NonSquareRoot.put(i,true);
                int n=2;
                while(n*i<=args) {
                    NonSquareRoot.put(n*i,false);
                    n++;
                }
            }
        }

        System.out.println("Prime Numbers:");
        for (Map.Entry<Integer, Boolean> entry : NonSquareRoot.entrySet()) {
            if (entry.getValue()) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
