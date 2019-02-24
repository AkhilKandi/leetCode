/*
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given a non-empty string containing only digits, determine the total number of ways to decode it.

Example 1:
Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).
*/

class Solution {
    public int numDecodings(String s) {
        
        if(s.length() == 0 || s == null) return 0;
        if(s.length() == 1){
            if(s.charAt(0) == '0')return 0;
            else return 1;
        }
        
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] =1;
        dp[1] = s.charAt(0)=='0'?0:1;
        
        int prev = s.charAt(0) - '0'; 
        
        for(int i=2; i<= len ; i++){
            
            int curr = s.charAt(i-1)-'0';
            int total = curr; 
            if(total <=9 && total >=1)dp[i] = dp[i] + dp[i-1];
            total = prev*10 + curr;
            if(total <= 26 && total >=10)dp[i] = dp[i]+dp[i-2];
            prev = curr;
            
        }
    }
}
