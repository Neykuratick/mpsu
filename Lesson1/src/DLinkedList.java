public class DLinkedList<T> {
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
        return head == null;
    }

    public boolean notEmpty() {
        return head != null;
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

    public Object getValueByIndex(int index) {

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


    public void insertAfter(Node node,int value) {
        Node newNode = new Node(value);

        newNode.next = node.next;
        node.next=newNode;
        newNode.prev=node;

        if (newNode.next != null) {
            // if the node is to be inserted after last node

            newNode.next.prev = newNode;
        } else {
            tail = newNode;
        }
    }

    public void insertBefore(Node node,int value) {
        Node newNode = new Node(value);

        if (node == head) {
            // if the node is to be inserted before head

            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        newNode.prev = node.prev;
        newNode.next = node;
        node.prev.next = newNode;
        node.prev = newNode;
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
