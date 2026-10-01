/* 94. Binary tree inorder traversal */

class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return arr ;
        
    }
    private void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}
