/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root,list);
        
        int left = 0, right = list.size() - 1;
        while (left < right){
            int sum = list.get(left) + list.get(right);
            if (sum == k)
                return true;
            else if (sum > k) right--;
            else left++;
        }
        return false;
        
        
    }
    void inorder(TreeNode root , List<Integer> list){
        if(root.left!=null)inorder(root.left,list);
        list.add(root.val);
        if(root.right!=null)inorder(root.right,list);
    }
}