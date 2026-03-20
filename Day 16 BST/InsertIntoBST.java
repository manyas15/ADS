// 701 leetcode

public class InsertIntoBST {
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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        InsertIntoBST solution = new InsertIntoBST();
        TreeNode root = solution.new TreeNode(4);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(7);
        root.left.left = solution.new TreeNode(1);
        root.left.right = solution.new TreeNode(3);

        int valToInsert = 5;
        TreeNode updatedRoot = solution.insertIntoBST(root, valToInsert);
        System.out.println(updatedRoot.val); // Output: 4
        System.out.println(updatedRoot.right.val); // Output: 7
        System.out.println(updatedRoot.right.left.val); // Output: 5
    }
}