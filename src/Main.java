public class Main {
/*
给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。

注意：两个节点之间的路径长度由它们之间的边数表示。

示例 1:

输入:

              5
             / \
            4   5
           / \   \
          1   1   5
输出:

2
 */
    public static void main(String[] args) {
        Solution solution=new Solution();
        Solution.TreeNode root=new Solution.TreeNode(5);
        root.left=new Solution.TreeNode(4);
        root.right=new Solution.TreeNode(5);
        root.left.left=new Solution.TreeNode(1);
        root.left.right=new Solution.TreeNode(1);
        root.right.right=new Solution.TreeNode(5);


        System.out.println(solution.longestUnivaluePath(root));
    }
}
