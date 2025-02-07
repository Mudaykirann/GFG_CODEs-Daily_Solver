//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution obj = new Solution();

            System.out.println(obj.getMaxOccuringChar(line));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s) {
        // Your code here
         int[] f=new int[26];
        char[] str=s.toCharArray();
        int l=str.length;
        int max=-1;
        char res=0;
        for(int i=0;i<l;i++)
        {
            if(str[i]!=' ')
                f[str[i]-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(f[i]>max)
            {
                max=f[i];
                res=(char)(i+'a');
            }
        }
        return res;
    }
}