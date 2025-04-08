import java.util.*;

public class minMaxArray {
    // Method to calculate the maximum of two numbers
    static public int max(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    // Method to calculate the minimum of two numbers
    static public int min(int a, int b) {
        return (a + b - Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Input array elements
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize minValue and maxValue with the first element of the array
        int minValue = arr[0];
        int maxValue = arr[0];

        // Iterate through the array to find the min and max
        for (int i = 1; i < n; i++) {
            minValue = min(minValue, arr[i]);
            maxValue = max(maxValue, arr[i]);
        }

        // Output the results
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}

