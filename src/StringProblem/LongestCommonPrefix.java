package StringProblem;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"gap","ganesh","ga","gana","gav"};
		
		String res = solution(str);
		System.out.println(res);
		
		String resa = rightSolution(str);
		System.out.println(resa);
	}
	
	public static String rightSolution(String[] strs) {
		Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        String res="";
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
            	res = res+s1.charAt(idx);
                idx++;
            } else {
                break;
            }
        }
        System.out.println(res+"result");
        return s1.substring(0, idx);
	}
	

	public static String findSmallString(String[] args) {
		int num=args[0].length();
		String sString = args[0];
		for(int i=1;i<args.length;i++) {
			if(num>args[i].length()) {
				num = args[i].length();
				sString = args[i];
			}
		}
		return sString;
	}
	
	public static String solution(String[] args) {
		int n = args.length;
		String lcPrefix ="";
		
		String smallString = findSmallString(args);
		System.out.println("smallest possible match="+smallString);
		
		for(int i=0;i<smallString.length();i++) {
			char a = smallString.charAt(i);			
			for(int j=0;j<args.length;j++) {
				if(a==args[j].charAt(i)) {
					lcPrefix = a+"";
				}else {
					break;
				}
			}			
		}
		if(lcPrefix=="") {
			lcPrefix="no prefix found";
		}
				
		return lcPrefix;
		
	}
	

}
