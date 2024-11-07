//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
         int n = s1.length();
        int m = s2.length();
        
        int[][]dp = new int [n+1][m+1];
        
        int count = 0;
        for(int i=1;i<n+1;i++)
        {
            for(int k=1;k<m+1;k++){
                if(s1.charAt(i-1) == s2.charAt(k-1)){
                    dp[i][k] =dp[i-1][k-1]+1;
                    
                    count = Math.max(count, dp[i][k]);
                }
            }
        }
        return count;
    }
}