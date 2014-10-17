public class BinaryTreeInOrderTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> node = new TreeNode<Integer>(2);
        TreeNode<Integer> leftNode = new TreeNode<Integer>(1);
        TreeNode<Integer> rightNode = new TreeNode<Integer>(3);
        node.setLeft(leftNode);
        node.setRight(rightNode);
        TreeHelper.iterativeInOrderTraversal(node);
    }
}
