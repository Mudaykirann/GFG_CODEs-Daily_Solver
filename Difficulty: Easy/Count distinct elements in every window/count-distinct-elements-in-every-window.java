//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            // taking total number of elements
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            ArrayList<Integer> ans = new Solution().countDistinct(k, arr);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int k, int arr[]) {
        // code here
        ArrayList<Integer> distinctCounts = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        distinctCounts.add(frequencyMap.size());
        for (int i = k; i < arr.length; i++) {
            int outgoing = arr[i - k];
            if (frequencyMap.get(outgoing) == 1) {
                frequencyMap.remove(outgoing);
            } else {
                frequencyMap.put(outgoing, frequencyMap.get(outgoing) - 1);
            }
            int incoming = arr[i];
            frequencyMap.put(incoming, frequencyMap.getOrDefault(incoming, 0) + 1);
            distinctCounts.add(frequencyMap.size());
        }
        return distinctCounts;
    }
}
