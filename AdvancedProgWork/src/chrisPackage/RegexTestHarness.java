package chrisPackage;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){

    	//This is a regular expression finder.
    	
    	Scanner sc = new Scanner(System.in);
    	
        while (true) {

            System.out.printf( "\nEnter your regex:");
            String s  = sc.next();
            Pattern pattern =  Pattern.compile( s );
            System.out.printf( "\nEnter input string to search:");
             String s2  = sc.next();
            Matcher matcher =  pattern.matcher( s2 );

            boolean found = false;
            while (matcher.find()) {
                System.out.printf("I found the text" + " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                System.out.printf("\nNo match found.%n");
            }
        }
    }
}
