//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        Arrays.sort(arr);
        int x=arr[(int)arr.length/2];
        int s=0;
        int e=arr.length-1;
        int first=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==x){
                first=m;
                e=m-1;
            }
            else if(arr[m]>x){
                e=m-1;
            }
            else{
                s=m+1;
            }
        
        }
        int last=first+(int)arr.length/2;
        if(last<arr.length && arr[last]==x){
            return x;
        }
        else{
            return -1;
        }
    }
}