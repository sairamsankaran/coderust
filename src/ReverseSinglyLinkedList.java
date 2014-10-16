public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        int[] array = {2,5,6,10,15};
        Node<Integer> head = NodeHelper.createLinkedList(array);

        System.out.println("Original list:");
        NodeHelper.printLinkedList(head);

        head = reverseLinkedListRecursively(head); // O(n)
        System.out.println("Reversed list:");
        NodeHelper.printLinkedList(head);

        head = reverseLinkedListIteratively(head); // O(n)
        System.out.println("Reversed again:");
        NodeHelper.printLinkedList(head);
    }

    public static Node<Integer> reverseLinkedListIteratively(Node<Integer> head) {
        Node<Integer> previous = null;
        Node<Integer> current = head;
        Node<Integer> next = null;
        while(current != null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    public static Node<Integer> reverseLinkedListRecursively(Node<Integer> head) {
        Node<Integer> previous = null;
        Node<Integer> current = head;
        return reverseLinkedListRecursiveHelper(current, previous);
    }

    private static Node<Integer> reverseLinkedListRecursiveHelper(Node<Integer> current, Node<Integer> previous) {
        Node<Integer> next = null;
        if(current != null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
            return reverseLinkedListRecursiveHelper(current, previous);
        }
        return previous;
    }
}