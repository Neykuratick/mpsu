public class DLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public static String notFoundError = "entity not found";

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public boolean notEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        size++;

        newNode.prev = null;
        newNode.next = head;

        if (isEmpty()) {
            // if the list is empty

            head = newNode;
            tail = newNode;
            return;
        }

        head.prev = newNode;
        head = newNode;
    }

    public void append(Object data) {
        Node newNode = new Node(data);
        size++;

        newNode.prev = tail;
        newNode.next = null;

        if (isEmpty()) {
            // if the list is empty

            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public Object getValueIndex(int index) {
        Node traverse = head;

        int iteratorIndex = 0;

        while (iteratorIndex != index && traverse.next != null) {
            traverse = traverse.next;
            iteratorIndex++;
        }

        if (traverse != null) {
            return traverse.data;
        }

        throw new RuntimeException(notFoundError);
    }

    public void printAll() {
        Node traverse = head;

        while (traverse != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
    }
}
