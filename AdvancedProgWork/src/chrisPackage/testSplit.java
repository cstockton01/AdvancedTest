package chrisPackage;

public class testSplit {
	
	public static void main(String[] args) {
		//There is poor data here because there is an extra space! you can fix this using REGEX.
		String[] tokens = "Java HTML Perl  PHP".split(" ", 0);
		for (int i = 0; i < tokens.length; i++) {
		  System.out.printf("\nCt:%d is TOK:%s", i, tokens[i]);
		}
	}

}
