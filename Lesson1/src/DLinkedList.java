public class DLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public static String notFoundError = "entity not found";
    public static String outOfRangeError = "entity is out of range";

    public void printAll() {
        Node traverse = head;

        while (traverse != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public boolean notEmpty() {
        if (head == null) {
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

        if (index < 0 || index >= size) {
            throw new RuntimeException(outOfRangeError);
        }


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

    public Node getNodeIndex(int index) {

        if (index < 0 || index >= size) {
            throw new RuntimeException(outOfRangeError);
        }

        Node traverse = head;

        int iteratorIndex = 0;

        while (iteratorIndex != index && traverse.next != null) {
            traverse = traverse.next;
            iteratorIndex++;
        }

        if (traverse != null) {
            return traverse;
        }

        throw new RuntimeException(notFoundError);
    }

    public void setValueIndex(int index, Object data) {

        if (index < 0 || index >= size) {
            throw new RuntimeException(outOfRangeError);
        }

        Node traverse = head;

        int iteratorIndex = 0;

        while (iteratorIndex != index && traverse.next != null) {
            traverse = traverse.next;
            iteratorIndex++;
        }

        if (traverse != null) {
            traverse.data = data;
            return;
        }

        throw new RuntimeException(notFoundError);
    }

    public Node findNodeFirst(Object value) {
        Node traverse = head;

        while (traverse != null) {

            if (traverse.data.equals(value)) {
                return traverse;
            }

            traverse = traverse.next;
        }

        throw new RuntimeException(notFoundError);
    }

    private void removeNodeHead() {
        head = head.next;
        head.prev = null;
        size--;
    }

    private void removeNodeTail() {
        head = head.prev;
        head.next = null;
        size--;
    }

    public void removeFirstNodeValue(Object value) {
        Node traverse = head;

        while (traverse != null) {

            if (traverse.data.equals(value)) {

                if (traverse.prev == null) {
                    removeNodeHead();
                    return;
                }

                if (traverse.next == null) {
                    removeNodeTail();
                    return;
                }

                traverse.prev.next = traverse.next;
                size--;
                return;
            }

            traverse = traverse.next;
        }

        throw new RuntimeException(notFoundError);
    }
}
