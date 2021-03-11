public class Main {
    public static void main(String args[]) {
        DLinkedList list = new DLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        list.printAll();
        System.out.println();

        Node node = list.findNodeFirst(2);
        list.insertAfter(node, 22);

        list.printAll();
    }
}
