//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        // code here
        int i=0 , j=0;
        int count=0;
        char str[] = S.toCharArray();
        while(j<S.length()){
            if(W.charAt(i) == str[j]){
               str[j] = '#';
                i++;
            }
            if(i==W.length()){
                count++;
                i=0;
                j=-1;
            }
            j++;
        }
        return count;
    }
}