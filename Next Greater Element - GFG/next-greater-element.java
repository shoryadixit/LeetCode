//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        Stack<Long> s = new Stack<>();              
        long nge[] = new long[n];                   // Unordered Map to store all the result
        for (int i = n - 1; i >= 0; i--) {          // Run a loop in reverse order
            if (!s.empty()) {                               
                while (!s.empty() && s.peek() < arr[i]) { // If Peek element is less than curr element then it
                    s.pop();                              // can't be the next greater element, so pop it.
                } 
            } 
            nge[i] = s.empty() ? -1 : s.peek();   // If some element exist in stack then the top element is next
            s.push(arr[i]);                       // greater element. Push the current element to stack.
        } 
        return nge;
    } 
}