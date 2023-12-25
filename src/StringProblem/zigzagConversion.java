package StringProblem;

public class zigzagConversion {
    public static void main(String[] args) {
        String s = convert("abcdefghijklmno",3);
        System.out.println(s);

        String str = convertToZigzag("abcdefghijklmno",3);
        System.out.println(str);

    }

    public static String convertToZigzag(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0, step = 1;

        for (char ch : s.toCharArray()) {
            rows[index].append(ch);

            if (index == 0) {
                step = 1;
            } else if (index == numRows - 1) {
                step = -1;
            }

            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public  static  String convert(String s,int numRows){
        if(numRows==1){ return s; }
        StringBuilder answer = new StringBuilder();
        int n = s.length();
        int diff = 2*(numRows-1);
        int diagonalDiff = diff;
        int secondIndex,index;

        for(int i=0;i<numRows;i++){
            index=i;
            while (index < n) {
                answer.append(s.charAt(index));
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = diff-2*i;
                    secondIndex = index + diagonalDiff;

                    if (secondIndex < n) {
                        answer.append(s.charAt(secondIndex));
                    }
                }
                index += diff;
            }
        }
        return answer.toString();

    }
}
