//{ Driver Code Starts
//Initial Template for Java

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
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        String longest = "";
        int n = S.length();
        int j;
 

        String subs = "";
 

        String subsrev = "";
        for (int i = 0; i < n; i++) {
            j = n - 1;
            while (i < j) {

                if (S.charAt(i) == S.charAt(j)
                    && longest.length() < (j - i + 1)) {
                    subs = S.substring(i, j + 1);
                    subsrev = new StringBuilder(subs)
                                  .reverse()
                                  .toString();
                    if (subs.equals(subsrev)) {
                        longest = subs;
                    }
                }
                j--;
            }
        }
       
     
        if (longest.length() == 0) {
            longest = S.substring(0, 1);
        }
return longest;
    }
}