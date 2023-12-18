package ArrayProgram;
public class longestSubArray {
    public static void main(String[] args) {
       // int[] arrs = {0,1,1,1,0,1,1,0};
        //int a = longestSubarray(arrs);
        //System.out.println(a);
        String test = "Aa";
        Boolean r = isPalindrome(test);
        System.out.println(r);
    }

    public static boolean isPalindrome(String s) {
        int prev =0;
        s=s.toLowerCase();
        s =s.replace(" ","");
        s =s.replace(":","");
        s =s.replace(",","");
        s =s.replace(".","");
        int next = s.length()-1;
        //System.out.println(s);
        for(int i=0;i<=s.length()/2;i++){
            char one = s.charAt(prev);
            char two = s.charAt(next);
            if(prev<next){
                if(one!=two) {
                    return false;
                }
                prev++;
                next--;
            }

        }
        return true;

    }

}
