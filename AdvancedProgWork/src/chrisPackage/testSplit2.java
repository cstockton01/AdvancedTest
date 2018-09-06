package chrisPackage;

public class testSplit2 {

	public static void main(String[] args) {
		// In this we use REGEX (Regular Expression) to help fix poor data like an extra space.
		String[] tokens = "Java HTML Perl  PHP".split("\\s+", 0); //Collect data using space separated REGEX
		for (int i = 0; i < tokens.length; i++) {
		  System.out.printf("\nCt:%d is TOK:%s", i, tokens[i]);
		}
	}
}
