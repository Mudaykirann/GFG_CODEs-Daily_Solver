//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            String arr1[] = br.readLine().trim().split(" ");
            String arr2[] = br.readLine().trim().split(" ");

            int a[] = new int[arr1.length];
            int b[] = new int[arr2.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);
            for (int i = 0; i < b.length; i++) b[i] = Integer.parseInt(arr2[i]);

            Solution ob = new Solution();
            ob.mergeArrays(a, b);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                str.append(a[i] + " ");
            }
            System.out.println(str);
            str = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                str.append(b[i] + " ");
            }
            System.out.println(str);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int len = (n+m);
        int gap = (len/2) + (len%2);
        
        while(gap>0){
            int l=0;
            int r = l+gap;
            
            while(r<len){
                if(l<n && r >=n){
                    swap(a,b,l,r-n);
                }
                else if(l>=n){
                    swap(b,b,l-n,r-n);
                }
                else{
                    swap(a,a,l,r);
                }
                l++;
                r++;
            }
            
            if (gap == 1) {
                gap = 0;
            } else {
                gap = (gap / 2) + (gap % 2);
            }
        }
        
    }
    
    private static void swap(int a[],int b[],int l,int r){
        if(a[l] > b[r] ){
            int t=a[l];
            a[l]=b[r];
            b[r]=t;
        }
    }
}
