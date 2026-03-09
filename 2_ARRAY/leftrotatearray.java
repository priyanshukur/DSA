// Class containing the solve method
class Solution {

    // Function to solve and shift array elements left by one position
    public static void solve(int[] arr, int n) {
        int[] temp = new int[n];  // Temporary array to store shifted elements

        // Shift elements to the left by one position
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];  // First element moves to the last position

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        int n = 5;  // Size of the array
        int[] arr = {1, 2, 3, 4, 5};  // Original array

        Solution.solve(arr, n);  // Call the solve function from Solution class
    }
}