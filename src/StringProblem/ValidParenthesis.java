package StringProblem;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(){}[(]";
        System.out.println(isValid(s) );
    }


    public static boolean isValid(String s) {
        int len = s.length();
        for (int i = 1; i < len; i++) {
            char q = s.charAt(i - 1);
            char q1 = s.charAt(i);
            if (q == '(' && q1 != ')') {
                return false;
            } else if (q == '{' && q1 != '}') {
                return false;
            } else if (q == '[' && q1 != ']') {
                return false;
            }else if(len%2!=0){ return false;}
        }
        return true;
    }

    public static boolean isValida(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return false; // No corresponding opening parenthesis found
                }

                char top = stack.pop();
                if (currentChar == ')' && top != '(' ||
                        currentChar == '}' && top != '{' ||
                        currentChar == ']' && top != '[') {
                    return false; // Mismatched parenthesis
                }
            }
        }

        return stack.isEmpty();

    }
}
