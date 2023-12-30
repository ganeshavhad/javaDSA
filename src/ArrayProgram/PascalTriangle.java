package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

 public class PascalTriangle {
    public static void main(String[] args) {
        int num =5;
        List<List<Integer>> pSolution = generate(num);

        for (List<Integer> rows:pSolution){
            System.out.println(rows);
        }

        List<Integer> testRes = getRow(1);

        for (Integer rows:testRes){
            System.out.println(rows);
        }

    }

     public static List<Integer> getRow(int numRows) {
         List<List<Integer>> result = new ArrayList<>();
         if(numRows==0)  return Arrays.asList(1);

         List<Integer> firstRow = new ArrayList<>();
         firstRow.add(1);
         result.add(firstRow);
         if(numRows==1) return Arrays.asList(1,1);

         for(int i=1;i<=numRows;i++){
             List<Integer> prevRow = result.get(i-1);
             List<Integer> newRow = new ArrayList<>();
             newRow.add(1);
             for(int j=0;j<i-1;j++){
                 newRow.add(prevRow.get(j)+prevRow.get(j+1));
             }
             newRow.add(1);
             result.add(newRow);
         }
         return result.get(numRows);
     }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows==1) return result;

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j=0;j<i-1;j++){
                newRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            newRow.add(1);
            result.add(newRow);
        }

        return result;
    }
}
