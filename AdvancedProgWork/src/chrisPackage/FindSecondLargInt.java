package chrisPackage;

import java.util.Scanner;

public class FindSecondLargInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int intArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int i;
		
		//populate array
		for(i = 0; i < 10; i++) {
			System.out.printf("Enter an integer value: ");
			intArray[i] = input.nextInt();
		}
		
		//Print Result
		System.out.println("\nThe second largest INT was: " + SecondLargFunc(intArray));
		
		input.close();
	}

public static int SecondLargFunc(int[] a) {
		
		//Create place holders
		int largest = a[0];
		int secondLargest = a[0];
		
		//Print the array to show them
		System.out.println("The array has these numbers: " );
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i]+ "  " );
		}
		
		//perform operation to find second largest
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
			}
		
		}
		
		return secondLargest;
	}

}
