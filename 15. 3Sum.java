/*
15. 3Sum

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length ;i++){
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                List<Integer> al = new ArrayList<>();
                int temp= nums[i]+nums[j]+nums[k];
                if( temp < 0){
                    j++;
                }
                else if(temp > 0){
                    k--;
                }
                else if(temp == 0){
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    Collections.sort(al);
                    if(!ls.contains(al))
                    ls.add(al);
                    
                    int tmp1 =nums[j++];
                    int tmp2 = nums[k--];
                    
                    while(tmp1 == nums[j] && j<k) j++;
                    while(tmp2 == nums[k] && k>j) k--;
                }
            }
        }
        return ls;
    }
}
