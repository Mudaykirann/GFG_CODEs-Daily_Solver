//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String S){
        // code here
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for(int i=S.length()-1; i>0;i--){
            if(S.charAt(i)==S.charAt(i-1)){
                count++;
            }else{
                result.append(Integer.toHexString(count));
                result.append(S.charAt(i));
                count=1;
            }
        }
        result.append(Integer.toHexString(count));
        result.append(S.charAt(0));
        return result.toString();
    }
};