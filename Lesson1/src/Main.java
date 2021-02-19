public class Main {
    public static void main(String args[]) {
        DynamicArray dArr = new DynamicArray(10);
        System.out.println(dArr.getLength());

        dArr.setValue(0, "zero");
        dArr.setValue(1, 1);

        System.out.println(dArr.getValue(0));
        System.out.println(dArr.getValue(1));
        System.out.println(dArr.getValue(2));

        System.out.println("\nbreakpoint\n");

        dArr.resize(2);

        System.out.println(dArr.getLength());
        System.out.println(dArr.getValue(0));
        System.out.println(dArr.getValue(1));
        System.out.println(dArr.getValue(2));
    }
}
