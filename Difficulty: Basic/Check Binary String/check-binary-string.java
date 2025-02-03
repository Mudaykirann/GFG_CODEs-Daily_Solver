//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            if (new Sol().checkBinary (s))
    		    System.out.println ("VALID");
    		else
    		    System.out.println ("INVALID");
        
System.out.println("~");
}
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean checkBinary (String s)
    {
        // your code here
         int st=-1;
        int st1=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){                 
                st=i;
                break;
            }
        }
        if(st==-1){
            return true;
        }
        
        for(int j=st+1;j<s.length();j++){
            if(s.charAt(j)=='0'){
                st1=j;
                break;
            }
        }
        if(st1==-1){
            return true;
        }
        for(int k=st1+1;k<s.length();k++){
            if(s.charAt(k)=='1'){
                return false;
            }
        }
        return true;
    }
}
