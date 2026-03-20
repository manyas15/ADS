// 700 leetcode
public class SearchInBST {

    public TreeNode searchBST(TreeNode root, int val) {
        //root.val == target --> return root
        //if target < root.val --> left side jana h
        //if target > root.val --> right side 

        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
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
        SearchInBST solution = new SearchInBST();
        TreeNode root = solution.new TreeNode(4);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(7);
        root.left.left = solution.new TreeNode(1);
        root.left.right = solution.new TreeNode(3);

        int target = 2;
        TreeNode result = solution.searchBST(root, target);
        if (result != null) {
            System.out.println("Target found: " + result.val); // Output: Target found: 2
        } else {
            System.out.println("Target not found");
        }
    }
}
