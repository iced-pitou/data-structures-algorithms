import java.util.LinkedList;
import java.util.Queue;

import classes.BasicGraph;
import classes.BasicGraphNode;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 3, 4, 5 };
        TreeNode res = Tree.sortedArrayToBST(nums);
        Tree.inorderPrint(res);
    }
}

// TODO proper implementation
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

// TODO proper implementation
class Tree {

    static int iter = 1;

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1)
            return new TreeNode(nums[0]);

        return BSTBuilder(nums, 0, nums.length - 1);
    }

    private static TreeNode BSTBuilder(int[] nums, int leftBound, int rightBound) {
        if (leftBound > rightBound) return null; // What ?
        
        int mid = (leftBound + rightBound) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = BSTBuilder(nums, leftBound, mid - 1);
        root.right = BSTBuilder(nums, mid + 1, rightBound);

        return root;
    }

    public static void inorderPrint(TreeNode node) {
        if (node == null)
            return;
        inorderPrint(node.left);
        System.out.print(node.value + " ");
        inorderPrint(node.right);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        else if (root.left == null ^ root.right == null)
            return false;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

        TreeNode leftNode;
        TreeNode rightNode;
        while (queue.peek() != null) {
            leftNode = queue.poll();
            rightNode = queue.poll();

            // Check equality
            if (leftNode.value != rightNode.value)
                return false;
            if (leftNode.left == null ^ rightNode.right == null)
                return false;
            if (leftNode.right == null ^ rightNode.left == null)
                return false;

            // Outside
            if (leftNode.left != null && rightNode.right != null) {
                queue.add(leftNode.left);
                queue.add(rightNode.right);
            }
            // Inside
            if (leftNode.right != null && rightNode.left != null) {
                queue.add(leftNode.right);
                queue.add(rightNode.left);
            }
        }

        return true;
    }
}

class GraphWrapper extends BasicGraph {

    public GraphWrapper() {
    }

    /**
     * Breadth-first (BFS) approach to finding if a path exists between two nodes
     */
    public boolean pathExists(BasicGraphNode from, BasicGraphNode to) {
        Queue<BasicGraphNode> queue = new LinkedList<BasicGraphNode>();
        from.visited = true;
        queue.add(from);

        BasicGraphNode node = null;
        while (queue.size() > 0) {
            node = queue.poll();

            for (BasicGraphNode adjacent : node.adjacent) {
                if (adjacent == to)
                    return true;

                if (!adjacent.visited) {
                    adjacent.visited = true;
                    queue.add(adjacent);
                }
            }
        }

        return false;
    }

    public void printNodes() {
        for (BasicGraphNode node : nodes) {
            if (node.adjacent == null)
                continue;

            System.out.print(node.value + " -> [");
            for (BasicGraphNode child : node.adjacent)
                System.out.print(String.format("%c,", child.value));
            System.out.println("]");
        }
    }

}
