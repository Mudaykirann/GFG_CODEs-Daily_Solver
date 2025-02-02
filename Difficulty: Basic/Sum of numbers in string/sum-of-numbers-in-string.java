//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();

            System.out.println(obj.findSum(s));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        // your code here
        int sum = 0;
        int currentNumber = 0;
        boolean isBuildingNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                isBuildingNumber = true;
            } else {
                if (isBuildingNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    isBuildingNumber = false;
                }
            }
        }

        if (isBuildingNumber) {
            sum += currentNumber;
        }

        return sum;
    }
}