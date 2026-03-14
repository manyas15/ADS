
public class SameTreeBT {

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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTreeBT solution = new SameTreeBT();
        TreeNode p = solution.new TreeNode(1);
        p.left = solution.new TreeNode(2);
        p.right = solution.new TreeNode(3);

        TreeNode q = solution.new TreeNode(1);
        q.left = solution.new TreeNode(2);
        q.right = solution.new TreeNode(3);

        System.out.println(solution.isSameTree(p, q)); // Output: true
    }
}
