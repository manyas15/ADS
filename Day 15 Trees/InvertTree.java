public class InvertTree {
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

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        InvertTree solution = new InvertTree();
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(3);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(5);

        TreeNode invertedRoot = solution.invertTree(root);
        System.out.println(invertedRoot.val); // Output: 1
        System.out.println(invertedRoot.left.val); // Output: 3
        System.out.println(invertedRoot.right.val); // Output: 2
        System.out.println(invertedRoot.right.left.val); // Output: 5
        System.out.println(invertedRoot.right.right.val); // Output: 4
    }
}