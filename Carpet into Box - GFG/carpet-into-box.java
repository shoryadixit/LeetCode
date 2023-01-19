//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class pair implements Comparable<pair> {
    int first, second;
    public pair(int first, int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(pair ob){
        if(this.first != ob.first)
            return this.first - ob.first;
        return this.second - ob.second;
    }

    @Override
    public String toString(){
        return first + " " + second;
    }

    static public pair from(int f, int s){
        return new pair(f, s);
    }
}

class Solution{
    int C, D;
    TreeMap<pair, Integer> dp;
    final int oo = (int) 1e8;
    
    boolean fits(int a, int b, int x, int y){
        //System.out.println(a + " " + b + " " + x + " " + y);
        if(a <= x && b <= y)
            return true;
        int tmp = a; a = b; b = tmp;
        if(a <= x && b <= y)
            return true;
        return false;
    }
    
    int solve(int A, int B){
        if(fits(A, B, C, D)){
            return 0;
        }
        
        if(dp.containsKey(pair.from(A, B)))
            return dp.get(pair.from(A, B));
        
        int op1 = oo, op2 = oo;
        if(A != 0)
            op1 = 1 + solve(A / 2, B);
        if(B != 0)
            op2 = 1 + solve(A, B / 2);
        int ret = Math.min(op1, op2);
        dp.put(pair.from(A, B), ret);
        return ret;
    }
    
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        dp = new TreeMap<>();
        this.C = C;
        this.D = D;
        return solve(A, B);
    }
   
}