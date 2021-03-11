package DLinkedList;

public class Node<T> {
    Node next;
    Node prev;
    T data;

    public Node() {

    }

    public Node(T value) {
        data = value;
    }
}
