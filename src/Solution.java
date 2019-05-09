class Solution {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans=0;
        int x=analyze(root);

        return ans;
    }
    public int analyze(TreeNode root){
        if(root==null){
            return 0;
        }
        int a= analyze(root.left);
        int b=analyze(root.right);
        int c=0,d=0;
        if(root.left!=null&&root.left.val==root.val){
            c=a+1;
        }
        if(root.right!=null&&root.right.val==root.val){
            d=b+1;
        }
        int e=c+d;
        ans=Math.max(e,ans);
        return Math.max(c,d);
    }
}