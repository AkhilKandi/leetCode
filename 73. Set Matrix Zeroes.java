/*
73. Set Matrix Zeroes
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]

*/
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
       
        for(int i =0; i< matrix.length ;i++){
            for(int j=0; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i: row){
            Arrays.fill(matrix[i],0);
        }
        for(int j : col){
            for(int i = 0 ; i< matrix.length ;i++){
                matrix[i][j] =0;
            }
        }
    }
}
