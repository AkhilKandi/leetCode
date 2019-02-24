/*
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     List<List<Integer>> res = new ArrayList<>();
    boolean bl = false;
    boolean br = false;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    int height1 = height(root);
        
        for(int i=1 ; i<=height1 ; i++){
            List<Integer> ls = new ArrayList<>();
            if(i%2 == 1){
                bl = true;
            }else br = true;
            levelOrder(root, i,ls,bl,br);
            res.add(ls);
            bl = false;
            br = false;
        }
        return res;
    }
    
    
    void levelOrder(TreeNode root , int i, List<Integer> ls, boolean bl,boolean br){
        if(root == null )return;
        
        if(i == 1){
            ls.add(root.val);
        }
        else if(br){
            levelOrder(root.right, i-1,ls,bl,br);
            levelOrder(root.left, i-1,ls,bl,br);
            
        }
        else if(bl){
            levelOrder(root.left, i-1,ls,bl,br);
            levelOrder(root.right, i-1,ls,bl,br);
            
        }
    }
    
    int height(TreeNode root){
        
        if(root == null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        if(left>right) return left+1;
        else return right+1;
    }
}
