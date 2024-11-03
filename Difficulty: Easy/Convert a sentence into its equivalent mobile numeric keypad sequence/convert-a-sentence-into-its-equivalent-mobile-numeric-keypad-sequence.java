//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        String res="";
        for(int x=0;x<S.length();x++)
        {
            char ch= S.charAt(x);
            if(ch==32)
                res+=0;
            else if(ch>='A' && ch<='C')
            {
                res+="2".repeat(ch-65+1);
            }
            else if(ch>='D' && ch<='F')
            {
                res+="3".repeat(ch-68+1);
            }
            else if(ch>='G' && ch<='I')
            {
                res+= "4".repeat(ch-71+1);
            }
            else if(ch>='J' && ch<='L')
            {
                res+= "5".repeat(ch-74+1);
            }
            else if(ch>='M' && ch<='O')
            {
                res+= "6".repeat(ch-77+1);
            }
            else if(ch>='P' && ch<='S')
            {
                res+= "7".repeat(ch-80+1);
            }
            else if(ch>='T' && ch<='V')
            {
                res+= "8".repeat(ch-84+1);
            }
            else if(ch>='W' && ch<='Z')
            {
                res+= "9".repeat(ch-87+1);
            }
        }
        return res;
    }
}