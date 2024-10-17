//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().trappingWater(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    public long trappingWater(int arr[]) {
        // Your code here
        int n=arr.length;
        int lmax=0,rmax=0,l=0,r=n-1;
        long total=0;
        
        while(l<r){
            if(arr[l]<=arr[r]){
                if(lmax>arr[l]) total+=lmax-arr[l];
                else lmax = arr[l];
                l=l+1;
            }
            else{
                if(rmax>arr[r]) total+=rmax-arr[r];
                else rmax=arr[r];
                r=r-1;
            }
        }
        return total;
    }
}
