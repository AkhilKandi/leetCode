/*
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
*/

class Solution {
    public boolean wordBreak(String s, List<String> words) {
        
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        
        for(int i = 1; i <= s.length();i++){
            
            for(String word : words){
                
                if(i >= word.length()){
                    if(res[i-word.length()]){
                        if(s.substring(i-word.length(),i).equals(word))
                            res[i] = true;
                    }
                }
                
            }
            
        }
        return res[s.length()];
    }
}
