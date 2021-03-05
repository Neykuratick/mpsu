public class Main {
    public static void main(String args[]) {
        DLinkedList list = new DLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        list.printAll();
        System.out.println();

        list.removeFirstNodeValue(2);
        list.printAll();
    }
}
