//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.count(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int count(int[] arr, int target) {
        // code here
        int l=0;
        int r=arr.length-1;
        
        while(l<=r)
        {
            if(arr[l]==target && arr[r]==target)
            {
                return r-l+1;
            }
            else if(arr[l]<target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return 0;
    }
}
