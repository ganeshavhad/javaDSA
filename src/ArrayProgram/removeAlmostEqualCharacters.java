package ArrayProgram;

public class removeAlmostEqualCharacters {
    public static void main(String[] args) {
        String s="abddez";
        int m = s.length();
        int count=0;
        for(int i=0; i<m-1; i++){
            char c=s.charAt(i), n=s.charAt(i+1);
            if(c == n || (Math.abs(c - n) < 2)){
                count++;
                i+=1;
            }
        }

        System.out.println(count);

    }
}
