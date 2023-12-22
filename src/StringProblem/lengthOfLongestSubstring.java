package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s= "abcabcbb";
        int len=s.length();
        int start=0, end=0 ,maxString=0;
        Map<Character,Integer> subString= new HashMap<>();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            subString.put(c, subString.getOrDefault(c,0)+1);
                while (subString.get(c)>1) {
                    char a = s.charAt(start);
                    subString.put(a, subString.get(a) - 1);
                    start++;
                }
            end++;
            maxString = Math.max(maxString,end-start);
        }

        System.out.println(maxString);


    }
}
