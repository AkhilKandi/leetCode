/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/

class Solution {
    public boolean isPalindrome(int num) {
        boolean flag = false;
        int rev=0;
        int temp1 = num;
		if (num < 0) {
			flag = false;
		}
		else{
			while(num>0){
				int temp = num%10;
				rev = (rev*10)+temp;
				num = num/10;
			}
			if(temp1 == rev)
				flag=true;
		}
		return flag;
    }
}
