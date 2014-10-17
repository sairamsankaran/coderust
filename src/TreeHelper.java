import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeHelper {
    public static void iterativeInOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        boolean done = false;
        while(!done) {
            if(currentNode != null) { // if current node is valid, push it, pass on to its left node
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else { // current node not valid, check if you can process last inserted node
                if (stack.isEmpty()) { // no node available to process, break
                    done = true;
                } else { // get the last inserted node, process it, pass on to its right node
                    currentNode = stack.pop();
                    System.out.print(" " + currentNode.getValue() + " ");
                    currentNode = currentNode.getRight();
                }
            }
        }
    }

    public static void recursiveInOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        recursiveInOrderTraversal(root.getLeft());
        System.out.print(" " + root.getValue() + " ");
        recursiveInOrderTraversal(root.getRight());
    }

    public static boolean isIdenticalIterative(TreeNode root1, TreeNode root2){
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();

        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 != null && root2 != null) {
            queue1.add(root1);
            queue2.add(root2);
        } else {
            return false;
        }
        while(!queue1.isEmpty() && !queue2.isEmpty()){
            // do a bfs on both trees, checking at each node if they are identical
            TreeNode node1 = queue1.remove();
            TreeNode node2 = queue2.remove();
            if(node1.getValue() != node2.getValue()) {
                return false;
            }
            if(node1.getLeft() != null){
                queue1.add(node1.getLeft());
            }
            if(node1.getRight() != null){
                queue1.add(node1.getRight());
            }
            if(node2.getLeft() != null){
                queue2.add(node2.getLeft());
            }
            if(node2.getRight() != null){
                queue2.add(node2.getRight());
            }
        }
        return true;
    }

    public static boolean isIdenticalRecursive(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return root1.getValue() == root2.getValue()
                    && isIdenticalRecursive(root1.getLeft(), root2.getLeft())
                    && isIdenticalRecursive(root1.getRight(), root2.getRight());
        } else {
            return false;
        }
    }
}
