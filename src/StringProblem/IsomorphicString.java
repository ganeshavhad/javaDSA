package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        String s= "paper";
        String t= "title";
        IsomorphicString obj =new IsomorphicString();
        Boolean result =  obj.isomorphic(s,t);
        System.out.println(result);
    }

    public Boolean isomorphic(String s, String t){
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        if(s.length()!=t.length())
            return false;

        for (int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1.containsKey(c1) && map1.get(c1) != c2)
                return false;

            if (map2.containsKey(c2) && map2.get(c2) != c1)
                return false;

            if (!map1.containsKey(c1) && !map2.containsKey(c2)) {
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }
        return true;
    }
}
