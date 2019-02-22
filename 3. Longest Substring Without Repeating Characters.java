
/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
    
        Set<Character> set = new HashSet<>();
        
        int i=0, j=0, res =0;
        
        while(i<n && j<n){
            
            if(!set.contains(s.charAt(j))){
                
                set.add(s.charAt(j++));
                res = Math.max(res, j-i);
            }
            else{
                
                set.remove(s.charAt(i++));
                
            }
            
        }
        
        return res;
    }
    
}
