/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/

class Solution {
    String str="";
    int max=0;
    public String longestPalindrome(String s) {
      
        for(int i=0; i< s.length();i++){
            
            palindrome(s,i,i,0);
            palindrome(s,i,i+1,0);
        }
        return str;
       
    }
    
    void palindrome(String s, int i , int j, int length){
        
        if(i<0 || j>=s.length() || s.charAt(i) != s.charAt(j))
            return;
        
        if(i==j)length++;
        else  length = length+2;
        
        if(length > max){
            str = s.substring(i,j+1);
            max = length;
            
        }
        palindrome(s,i-1,j+1,length);
       
    }
}
