public class Main {
    public static void main(String args[]) {
        DLinkedList list = new DLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.push(1);
        list.push(1);
        list.push(1);
        list.push(1);
        list.push(1);
        list.push(1);

        list.printAll();
        System.out.println();

        list.setValueIndex(1, 228);

        list.printAll();
    }
}
