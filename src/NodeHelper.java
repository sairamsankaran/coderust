public class NodeHelper {
    public static Node<Integer> createLinkedList(int[] array){
        int length = array.length;
        Node<Integer> node = null;
        if(length > 0) {
            node = new Node<Integer>(array[0]);
        }
        Node<Integer> head = node;
        for(int i = 1; i < length; i++){
            Node<Integer> nextNode = new Node<Integer>(array[i]);
            node.setNext(nextNode);
            node = nextNode;
        }
        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        Node<Integer> node = head;
        while(node != null){
            System.out.print(node.getValue());
            if(node.getNext() != null){
                System.out.print(" -> ");
            }
            node = node.getNext();
        }
        System.out.println();
    }
}
