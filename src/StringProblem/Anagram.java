package StringProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";

        System.out.println( validatedA(s,t));

        Map<Character,Integer> stringA = new HashMap<>();
        if(s.length()!=t.length()){
            System.out.println("invalid ");
        }
        for (int i=0;i<s.length();i++){
            stringA.put(s.charAt(i), stringA.getOrDefault(s.charAt(i),0)+1);
        }

        for (int j=0;j<t.length();j++){

            if( stringA.containsKey(t.charAt(j)) && stringA.get(t.charAt(j))>=1){
                stringA.put(t.charAt(j), stringA.get(t.charAt(j))-1);
            }else{
                System.out.println("invalid ");
            }
        }
        System.out.println("valid ");
    }


    public static Boolean validatedA(String s,String t){
        var sortedS = s.toCharArray();
        Arrays.sort(sortedS);
        var sortedT = t.toCharArray();
        Arrays.sort(sortedT);
        return new String(sortedS).equals(new String(sortedT));
    }
}
