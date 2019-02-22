/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


class Solution {
    
    public int[] twoSum(int[] nums, int target) {
       
        int[] res = new int[2];
        
        for(int i=0; i<nums.length ; i++){
            int temp = target-nums[i];
            for(int j=i+1 ; j<nums.length ;j++){
                if(nums[j] == temp){
                    res[0] =i;
                    res[1] =j;
                    return res;
                }
            }
            
        }
        return res;
    }
}
