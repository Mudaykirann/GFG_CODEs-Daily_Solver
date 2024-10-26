//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
         int patLength = pat.length();
        int txtLength = txt.length();

        // Edge case: if pattern is longer than text
        if (patLength > txtLength) {
            return 0;
        }

        // Frequency map for the pattern
        HashMap<Character, Integer> patCount = new HashMap<>();
        for (char c : pat.toCharArray()) {
            patCount.put(c, patCount.getOrDefault(c, 0) + 1);
        }

        // Frequency map for the current window in text
        HashMap<Character, Integer> windowCount = new HashMap<>();
        for (int i = 0; i < patLength; i++) {
            windowCount.put(txt.charAt(i), windowCount.getOrDefault(txt.charAt(i), 0) + 1);
        }

        int anagramCount = 0;

        // Check if the initial window is an anagram
        if (patCount.equals(windowCount)) {
            anagramCount++;
        }

        // Slide the window over the text
        for (int i = patLength; i < txtLength; i++) {
            // Add the next character to the window
            char newChar = txt.charAt(i);
            windowCount.put(newChar, windowCount.getOrDefault(newChar, 0) + 1);

            // Remove the first character of the previous window
            char oldChar = txt.charAt(i - patLength);
            if (windowCount.get(oldChar) == 1) {
                windowCount.remove(oldChar);
            } else {
                windowCount.put(oldChar, windowCount.get(oldChar) - 1);
            }

            // Compare the frequency maps
            if (patCount.equals(windowCount)) {
                anagramCount++;
            }
        }

        return anagramCount;
    }
}