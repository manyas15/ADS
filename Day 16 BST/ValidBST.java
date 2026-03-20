// 68 leetcode
public class ValidBST{
    public boolean isValidBST(TreeNode root) {
        return isValidate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidate(TreeNode node, long min, long max){
        if(node == null) return true;
        if(node.val <= min || node.val >= max) return false;

        return isValidate(node.left, min, node.val) && isValidate(node.right, node.val, max);
    }

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

    public static void main(String[] args) {
        ValidBST solution = new ValidBST();
        TreeNode root = solution.new TreeNode(2);
        root.left = solution.new TreeNode(1);
        root.right = solution.new TreeNode(3);

        boolean isValid = solution.isValidBST(root);
        System.out.println(isValid); // Output: true
    }
}