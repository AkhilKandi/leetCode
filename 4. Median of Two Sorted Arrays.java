
/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        
        int x = nums1.length;
        int y = nums2.length;
        
        int low = 0;
        int high = x;
        
        while(low <= high){
            
            int px = (low+high)/2;
            int py = (x+y+1)/2 - px;
            
            int leftMaxX = (px == 0) ?Integer.MIN_VALUE : nums1[px-1];
            int rightMinx = (px == x)?Integer.MAX_VALUE : nums1[px]; 
            
            int leftMaxY = (py == 0)?Integer.MIN_VALUE : nums2[py-1];
            int rightMinY = (py == y)?Integer.MAX_VALUE : nums2[py];
            
            
            if(leftMaxX <= rightMinY && leftMaxY <= rightMinx){
                
                if((x+y)%2 == 1){
                    return Math.max(leftMaxX , leftMaxY);
                }else{
                    
                    return (Math.max(leftMaxX , leftMaxY)+Math.min(rightMinx,rightMinY))/2.0;
                }
            }
            else if(leftMaxX > rightMinY){
                high = px-1;
            }else{
                low = px+1;
            }
            
            
        }
        return 0.0;
    }
}
