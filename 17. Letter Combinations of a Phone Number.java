/*
17. Letter Combinations of a Phone Number

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

*/
class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<String>();
        
        if(digits.length() == 0 || digits == null){
            return result;
        }
        String[] numbers = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinationsRecursive(digits,result,"",0,numbers);
        return result;
    }
    
    void letterCombinationsRecursive(String digits, List<String> result, String curr,int index,String[] numbers){
            result.add(curr);
            return;
        }
        String temp = numbers[digits.charAt(index)-'0'];
        for(int i=0; i<temp.length();i++){
            
            letterCombinationsRecursive(digits,result, curr+temp.charAt(i),index+1,numbers);
        }
    }
}
