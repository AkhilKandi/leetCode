/*
55. Jump Game
Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Example 1:
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

*/
class Solution {
	public boolean canJump(int[] nums) {

		if (nums.length == 1)
			return true;
		if (nums.length == 0)
			return true;
		if (nums[0] >= nums.length)
			return true;
		int len = nums.length;

		for (int i = 0; i < len;) {
			if (nums[i] == 0)
				return false;
			int t = i + nums[i];
			int temp = -1;
			int nextIndex = 0;
			for (int j = i + 1; j <= t; j++) {
				if (j >= nums.length - 1)
					return true;
				int index = j + nums[j];

				if (index > temp) {
					nextIndex = j;
					temp = index;
				}
				if (index >= nums.length)
					return true;
			}
			i = nextIndex;
		}
		return false;
	}
}
