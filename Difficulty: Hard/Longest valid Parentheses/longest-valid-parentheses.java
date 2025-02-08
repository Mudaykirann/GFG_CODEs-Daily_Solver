//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxLength(String s) {
        // code here
        int l=0,r=0,maxi=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') l++;
            if(s.charAt(i)==')') r++;
            if(l==r){
                maxi = Math.max(maxi,2*l);
            }
            else if(l<r){
                l=0;
                r=0;
            }
        }
        
        l=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(') l++;
            if(s.charAt(i)==')') r++;
            if(l==r){
                maxi = Math.max(maxi,2*l);
            }
            else if(l>r){
                l=0;
                r=0;
            }
        }
        
        
        return maxi;
        
    }
}