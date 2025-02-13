//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
      private String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String p= new String(arr);
        return p;
    }
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            String k = sort(arr[i]);
            ArrayList<String> list1 = map.getOrDefault(k, new ArrayList<String>());
            list1.add(arr[i]);
            map.put(k, list1);
        }
        map.forEach((k,v) -> list.add(v));
        
        return list;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends