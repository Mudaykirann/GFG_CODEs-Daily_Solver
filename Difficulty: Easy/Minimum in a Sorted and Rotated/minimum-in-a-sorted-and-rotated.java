//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution(); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
         int l=0,r=arr.length-1,ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[l] <= arr[mid]){
                ans = Math.min(ans,arr[l]);
                l=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                r=mid-1;
            }
        }
        return ans;
    }
    }
