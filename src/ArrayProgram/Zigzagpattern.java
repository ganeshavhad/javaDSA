package ArrayProgram;

public class Zigzagpattern
{
    public static void main(String[] args) {
        String que = "PAYPALISHIRING";
        String res = convert(que,4);
    }

    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int column = s.length()/numRows;
        int a=numRows;
        int n=0;
        int i=0;
        int len=s.length()-1;
        int maxCharRow=len/column;

        while(len>=0){

            if((i)%numRows==0){
                System.out.print(s.charAt(i+1));
            }else{
                System.out.print(" ");
            }

            n++;
            len--;
            if(n==maxCharRow){ System.out.println("45");n=0;}
        }
//        for(int i=0;i<s.length();i++){
//
//            if((i)%numRows==0){
//                System.out.print(s.charAt(i+1));
//            }else{
//                System.out.print(" ");
//            }
//            if((i+1)%numRows==0){
//                System.out.println("45");
//            }
//        }
        return s;
    }
}
