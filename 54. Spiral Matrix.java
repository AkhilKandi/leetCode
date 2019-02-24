/*
54. Spiral Matrix

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
*/


class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<Integer>();
        if(arr.length == 0 )return res;
        
        int i = 0; int j =0;
        int rowEnd = arr.length-1;
        int colEnd = arr[0].length-1;
        
        while(i <= rowEnd && j<= colEnd){
            
            for(int c=j ;c<=colEnd ; c++ ){
                res.add(arr[i][c]);
            }
            
            for(int r = i+1 ; r<= rowEnd ;r++){
                res.add(arr[r][colEnd]);
            }
            
            if(i<rowEnd && j<colEnd){
                for(int c=colEnd-1 ; c>=j; c-- ){
                    res.add(arr[rowEnd][c]);
                }
                for(int r= rowEnd-1 ; r>i ; r--){
                    res.add(arr[r][j]);
                }
            }
            i++;
            rowEnd--;
              j++;
            colEnd--;
        }
        return res;
    }
}
