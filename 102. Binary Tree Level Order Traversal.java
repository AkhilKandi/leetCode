class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        int height1 = height(root);
        
        for(int i=1 ; i<=height1 ; i++){
            List<Integer> ls = new ArrayList<>();
            levelOrder(root, i,ls);
            res.add(ls);
        }
        return res;
    }
    
    
    void levelOrder(TreeNode root , int i, List<Integer> ls){
        if(root == null )return;
        
        if(i == 1){
            ls.add(root.val);
        }
        else if(i>1){
            levelOrder(root.left, i-1,ls);
            levelOrder(root.right, i-1,ls);
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
