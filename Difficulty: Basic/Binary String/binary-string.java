//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int t;
    	t=sc.nextInt();
    	sc.nextLine();
    	while((t--)!=0){
    	    int n=sc.nextInt();
    	    sc.nextLine();
    	    String s = new String();
    	    s=sc.nextLine();
    	    Solution obj = new Solution();
    	    System.out.println(obj.binarySubstring(n, s));
    	
System.out.println("~");
}
	}
}
// } Driver Code Ends




class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        if(a==0||str.length()==0){
            return 0;
        }
        int count=-1;
        
        int vh=0;
        while(vh!=a){
            if(str.charAt(vh)=='1'){
                count++;
            }
            vh++;
        }
        if(count==0){
            return 0;
        }
        return (count*(count+1))/2;
        
    }
}