//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob =
            new Solution(); // Instantiate the Solution object once, not in the loop

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length];

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            int[] result = ob.dupLastIndex(arr);
            System.out.println(result[0] + " " + result[1]);
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int ele=-1,index=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                ele = arr[i];
                index = i;
                break;
            }
        }
        
        return new int[]{index,ele};
    }
}
