public class LowestCommonAncestor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        LowestCommonAncestor solution = new LowestCommonAncestor();
        TreeNode root = solution.new TreeNode(6);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(8);
        root.left.left = solution.new TreeNode(0);
        root.left.right = solution.new TreeNode(4);
        root.right.left = solution.new TreeNode(7);
        root.right.right = solution.new TreeNode(9);

        TreeNode p = solution.new TreeNode(2);
        TreeNode q = solution.new TreeNode(8);
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val); // Output: 6
    }
}