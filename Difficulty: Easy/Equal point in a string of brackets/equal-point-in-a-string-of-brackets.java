//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(str));
            
        
System.out.println("~");
}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public long countSub(String str) {
        // Your code goes here 
        long count = 0;
        for(char c:str.toCharArray())if(c == ')')count++;
        return count;
    }
}