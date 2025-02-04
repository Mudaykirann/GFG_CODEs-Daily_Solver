//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine();        // Consume the newline character after reading the integer

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the input string

            // Remove surrounding quotes from the string
            String str = s.substring(1, s.length() - 1);

            Solution obj = new Solution(); // Create an object of the Solution class
            String ans = obj.reverseWords(str); // Reverse the words in the string

            // Print the result with surrounding quotes
            System.out.println("\"" + ans + "\"");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else if (word.length()>0){
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        
        if(word.length()>0) stack.push(word.toString());
        
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
            if(!stack.isEmpty()) str.append(' ');
        }
        
        return str.toString();
    }
}
