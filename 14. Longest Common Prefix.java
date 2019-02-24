/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

*/



class Solution {
	public String longestCommonPrefix(String[] strs) {

		StringBuilder res = new StringBuilder();
		int len = Integer.MAX_VALUE;
		if (strs.length == 1)
			return strs[0];
		for (int i = 0; i < strs.length; i++) {
			if (len > strs[i].length())
				len = strs[i].length();
		}
		if (len == 0)
			return "";
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) == strs[j - 1].charAt(i)) {
					if (j == strs.length - 1)
						res.append(strs[j].charAt(i));
				} else
					return res.toString();
			}
		}
		return res.toString();
	}
}
