public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        int[] array = {2,5,6,10,15};
        int length = array.length;
        Node<Integer> node = new Node<Integer>(array[0]);
        Node<Integer> head = node;
        for(int i = 1; i < length; i++){
            Node<Integer> nextNode = new Node<Integer>(array[i]);
            node.setNext(nextNode);
            node = nextNode;
        }
        System.out.println("Original list:");
        printLinkedList(head);
        head = reverseLinkedListRecursively(head); // O(n)
        System.out.println("Reversed list:");
        printLinkedList(head);
        head = reverseLinkedListIteratively(head); // O(n)
        System.out.println("Reversed again:");
        printLinkedList(head);
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

class Node<T> {
    private T value;
    private Node next;

    Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}