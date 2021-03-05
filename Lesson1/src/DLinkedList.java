public class DLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    public boolean notEmpty() {
        if (size > 0) {
            return true;
        }
        return false;
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

        newNode.prev = tail;
        newNode.next = null;

        if (isEmpty()) {
            // if the list is empty

            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        size++;

        tail.next = newNode;
        tail = newNode;
    }

    public void printAll() {
        Node traverse = head;

        while (traverse != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
    }
}
