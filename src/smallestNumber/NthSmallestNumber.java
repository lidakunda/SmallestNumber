package smallestNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {
	public static void main(String[] args) {
        // Create an array to hold 500 random numbers
        int[] numbers = new int[500];
        Random random = new Random();

        // Generate 500 random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000) + 1; // Numbers between 1 and 1000
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Ask the user for the Nth smallest number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Nth smallest number you want to find: ");
        int n = scanner.nextInt();
        scanner.close();

        // Check if the input is within the valid range
        if (n > 0 && n <= numbers.length) {
            // Print the nth smallest number (note: n-1 for 0-based indexing)
            System.out.println("The " + n + "th smallest number is: " + numbers[n - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and " + numbers.length + ".");
        }
    }
}
