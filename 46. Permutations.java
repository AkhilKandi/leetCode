/*
46. Permutations

Given a collection of distinct integers, return all possible permutations.

Example:
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/

class Solution {
	public List<List<Integer>> permute(int[] nums) {

		LinkedList<List<Integer>> queue = new LinkedList<>();
		List<Integer> ls = new ArrayList();
		ls.add(nums[0]);
		queue.offer(ls);

		for (int i = 1; i < nums.length; i++) {
		
			int size = queue.size();
			while (size-- > 0) {
				List<Integer> ls1 = queue.poll();
				for (int j = 0; j <= ls1.size(); j++) {
					List<Integer> temp = new ArrayList<>(ls1);
					temp.add(j, nums[i]);
					queue.offer(temp);
				}
			}
		}
		return queue;
	}
}
