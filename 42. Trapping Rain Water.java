/* 42. Trapping Rain Water.java
Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it is able to trap after raining.

Example:
Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
*/

class Solution {
    public int trap(int[] height) {
        
        if(height.length == 0 || height.length == 1 )return 0;
        int sum=0;
        
        for(int i=1; i<height.length;i++){
            
            int left_max =0; int right_max =0;
            
            for(int j=i; j>=0;j--){
                left_max = Math.max(left_max, height[j]);
            }
            
            for(int j=i; j<height.length;j++){
                right_max =  Math.max(right_max,height[j]);
            }
            
            sum += Math.min(left_max,right_max)-height[i]; 
            
        }
        return sum;
    }
    
}
