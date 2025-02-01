//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Corrected to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution ob = new Solution();
            System.out.println(
                ob.minRemoval(arr)); // Passes the int[] array to the method
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the minimum number of elements to be removed.
    public int minRemoval(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int minRemovals = n; 
        
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            while (2 * arr[left] < arr[right]) {
                left++; 
            }
            
            int validSize = right - left + 1;
            minRemovals = Math.min(minRemovals, n - validSize);
        }
        return minRemovals;
    }
}