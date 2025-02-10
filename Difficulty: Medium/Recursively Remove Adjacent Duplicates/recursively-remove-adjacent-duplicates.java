//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String S = br.readLine();
            Solution ob = new Solution();

            String s = ob.removeUtil(S);
            if (s.isEmpty()) {
                System.out.println("\"\"");
            } else {
                System.out.println(s);
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeUtil(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length()-1 && s.charAt(j) == s.charAt(j+1)){
                j++;
            }
            
            if(i==j) str.append(s.charAt(i));
            
            i=j+1;
        }
        String result = str.toString();
        return (result.equals(s)) ? result : removeUtil(result);
    }
}