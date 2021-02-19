public class Main {
    public static void main(String args[]) {
        DynamicArray dArr = new DynamicArray(10);

        System.out.println(dArr.getLength());
        dArr.setValue(1, 'h');
        dArr.setValue(2, 1337);
        System.out.println(dArr.getValue(1));
        System.out.println(dArr.getValue(2));
        System.out.println(dArr.getValue(3));
    }
}
