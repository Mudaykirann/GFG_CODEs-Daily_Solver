//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String arr1[] = br.readLine().split(" ");
            int[] a = new int[arr1.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);

            String arr2[] = br.readLine().split(" ");
            int[] b = new int[arr2.length];

            for (int i = 0; i < arr2.length; i++) b[i] = Integer.parseInt(arr2[i]);

            if (b.length == 1 && b[0] == 0) {
                b = new int[0];
            }
            double res = new Solution().medianOf2(a, b);

            if (res == (int)res)
                System.out.println((int)res);
            else
                System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int n = a.length;
        int m = b.length;
        int[] newArr = new int[n + m]; 
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                newArr[k++] = a[i++];
            } else {
                newArr[k++] = b[j++];
            }
        }
        
        while (i < n) {
            newArr[k++] = a[i++];
        }

        while (j < m) {
            newArr[k++] = b[j++];
        }

        int len = newArr.length;
        if (len % 2 == 0) {
            return (newArr[len / 2 - 1] + newArr[len / 2]) / 2.0;
        } else {
            return newArr[len / 2];
        }
    }
}