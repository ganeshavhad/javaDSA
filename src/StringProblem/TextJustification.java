package StringProblem;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[]  words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> out = fullJustifyFunc(words,16);
        for (String a:out){
            System.out.println(a);
        }
    }

    public static List<String> fullJustifyFunc(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        for (int i=0;i<words.length;i++){
                int remainLen = words[i].length() - maxWidth;
                while (remainLen>0){
                    if(remainLen>=words[i].length()){
                        result.add(words[i] + " ");
                    }
                    i++;
                    remainLen = words[i].length() - remainLen;
                }

        }
        return  result;
    }
}
