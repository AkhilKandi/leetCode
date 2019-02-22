/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
*/

class Solution {
    public int reverse(int x) {
        
        int num = x;
        long rev=0;
		boolean flag = false;
       
		if (num < 0) {
			flag = true;
			num = (num)*(-1);
		}
		while(num>0){
			int temp = num%10;
			rev = (rev*10)+temp;
			num = num/10;
		}
		if(flag == true){
			rev=rev*(-1);
		}
		
		if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
			rev=0;
		}
    
        return (int)rev;
    }
}
