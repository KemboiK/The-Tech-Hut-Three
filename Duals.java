import java.util.Arrays;
import java.util.Scanner;

public class Duals {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strengths
        System.out.print("Enter the number of strengths: ");
        int numStrengths = scanner.nextInt();

        // Create an array to store the strengths
        int[] strengths = new int[numStrengths];

        // Prompt the user to enter each strength
        System.out.println("Enter the strengths:");
        for (int i = 0; i < numStrengths; i++) {
            strengths[i] = scanner.nextInt();
        }

        // Sort the array of strengths in ascending order
        Arrays.sort(strengths);

        // Initialize variables to store the minimum difference and the pair with the
        // minimum difference
        int minDifference = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        // Iterate through the sorted array to find the two closest strengths
        for (int i = 0; i < numStrengths - 1; i++) {
            // Calculate the difference between consecutive strengths
            int difference = strengths[i + 1] - strengths[i];

            // Update the minimum difference and closest pair if the current pair has a
            // smaller difference
            if (difference < minDifference) {
                minDifference = difference;
                closestPair[0] = strengths[i];
                closestPair[1] = strengths[i + 1];
            }
        }

        // Print the result: the two closest strengths and their difference
        System.out.println("The two closest strengths are: " + closestPair[0] + " and " + closestPair[1]);
        System.out.println("The difference between them is: " + minDifference);
    }
}
