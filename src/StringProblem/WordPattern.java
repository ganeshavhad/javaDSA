package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
       Boolean res = wordPatternSol(pattern,s);
        System.out.println(res);
    }

    public static Boolean wordPatternSol(String pattern, String s){
    Map<Character,String> mapA = new HashMap<>();
    Map<String,Character> mapB = new HashMap<>();
    String[] sArr = s.split(" ");

    if(pattern.length()!= sArr.length) return false;

    for (int i=0;i<pattern.length();i++){
        if(mapA.containsKey(pattern.charAt(i))){
            if(!mapA.get(pattern.charAt(i)).equals(sArr[i])){
                return false;
            }
        }
        else if(mapB.containsKey(sArr[i])){
            if(!mapB.get(sArr[i]).equals(pattern.charAt(i))){
                return false;
            }
        }
        else{
            mapA.put(pattern.charAt(i),sArr[i]);
            mapB.put(sArr[i],pattern.charAt(i));
        }
    }
    return true;

    }

}
