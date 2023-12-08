package StringProblem;

public class StringProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "{} asd <p> test here </p>";
		a = a.replaceAll("\\<[^>]*>","");
	//	a.contains(">");
		System.out.println(a.contains("</"));
		System.out.println(a.contains("}"));
		System.out.println(a.contains("{"));
		System.out.println(a);
		String string = "<";
		if (string == null || string.length() == 0) {
			System.out.println("=="+string);
		}
		  String input = "<p>This is <b>some</b> <a href='https://example.com'>text</a>.</p>";

	        String textWithoutTags = removeHtmlTags(input);
	        System.out.println(textWithoutTags);
	        
	        string = "test . png . test";
	       String[] str =  string.split(".");
	       for(String strA: str) {
	    	   System.out.println("abcd=="+strA); 
	       }
	        System.out.println("12=="+str.length);
	        
	        string = "004-0345.56";
	        String[] parts = string.split("-");
	        String part1 = parts[0]; // 004
	        String part2 = parts[1];
	        
	        System.out.println("12=="+part2);
	        
	        String inputA = "Hello.pdf";

	        // Split the string by a full stop
	        String[] partsA = inputA.split("\\.");
	        System.out.println("12=="+partsA.length);
	        String part2A = partsA[1];
	        // Display the result
	        for (String part : partsA) {
	            System.out.println(part.trim()); // trim to remove leading/trailing spaces
	        }
	        
	    }

	    public static String removeHtmlTags(String input) {
	        return input.replaceAll("<.*?>", ""); // Remove all HTML tags
	    }
}
