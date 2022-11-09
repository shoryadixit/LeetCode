//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

    public int minDifference(int arr[], int n) 
	{ 
	    Map<String, Integer> lookup = new HashMap<>();
	    return solve(arr, n - 1, 0, 0, lookup);
	} 
	public static int solve(int[] S, int n, int S1, int S2,
                                Map<String, Integer> lookup)
    {
       
        if (n < 0) {
            return Math.abs(S1 - S2);
        }
        String key = n + "|" + S1;
 
        if (!lookup.containsKey(key))
        {
        
            int inc = solve(S, n - 1, S1 + S[n], S2, lookup);
 
            int exc = solve(S, n - 1, S1, S2 + S[n], lookup);
 
            lookup.put(key, Integer.min(inc, exc));
        }
 
        return lookup.get(key);
    }
}
