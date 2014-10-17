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
}
