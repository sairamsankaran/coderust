public class MergeSortedLinkedLists {
    public static void main(String[] args) {
        int[] array1 = {};
        Node<Integer> list1 = NodeHelper.createLinkedList(array1);

        int[] array2 = {};
        Node<Integer> list2 = NodeHelper.createLinkedList(array2);

        System.out.println("List1");
        NodeHelper.printLinkedList(list1);
        System.out.println("List2");
        NodeHelper.printLinkedList(list2);
        System.out.println("Merged List");
        NodeHelper.printLinkedList(mergeSortedLinkedLists(list1, list2));
    }

    public static Node<Integer> mergeSortedLinkedLists(Node<Integer> list1, Node<Integer> list2){
        // assumption is list1 & list2 are sorted
        Node<Integer> tempHead = new Node<Integer>(1);
        Node<Integer> current = tempHead;

        Node<Integer> current1 = list1;
        Node<Integer> current2 = list2;

        while(current1 != null && current2 != null){ // O(m+n)
            if(current1.getValue() < current2.getValue()) {
                current.setNext(current1);
                current = current1;
                current1 = current1.getNext();
            } else {
                current.setNext(current2);
                current = current2;
                current2 = current2.getNext();
            }
        }
        // if some list is still not processed, attach it to the end
        if(current1 != null) {
            current.setNext(current1);
        }
        if(current2 != null) {
            current.setNext(current2);
        }

        return tempHead.getNext();
    }
}

