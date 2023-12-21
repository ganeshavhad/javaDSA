package StringProblem;

public class ReverseString {
    public static void main(String[] args) {
            String s= " i   am    ganesh";
            String[] words = s.split(" ");
            StringBuilder y = new StringBuilder();
            int n=words.length-1;
            while(n>=0){
                if(!words[n].isEmpty()) {
                    y.append(words[n]).append(" ");

                }
                n--;
            }

        System.out.println(y.toString());

    }
}
