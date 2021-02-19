public class Main {
    public static void main(String args[]) {
        DynamicArray dArr = new DynamicArray(10);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, "garbage");
        dArr.setValue(4, "garbage");

        for (int i = 0; i < 10; i++ ) {
            System.out.println(dArr.getValue(i));
        }

        System.out.println("\n");

        dArr.addValue("1");

        for (int i = 0; i < 10; i++ ) {
            System.out.println(dArr.getValue(i));
        }
    }
}
