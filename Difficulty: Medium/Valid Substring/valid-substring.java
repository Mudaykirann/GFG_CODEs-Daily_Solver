//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        
        // code here
        
        int left = 0, right = 0, maxLen = 0;

        // Left to right traversal
        for (char ch : S.toCharArray()) {
            if (ch == '(') left++;
            else right++;

            if (left == right) maxLen = Math.max(maxLen, 2 * right);
            else if (right > left) left = right = 0;
        }
        left = right = 0;
        // Right to left traversal
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == ')') right++;
            else left++;

            if (left == right) maxLen = Math.max(maxLen, 2 * left);
            else if (left > right) left = right = 0;
        }

        return maxLen;
    }
};