public class Main {
    public static void main(String args[]) {
        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, "garbage");
        dArr.setValue(4, "garbage");

        for (int i = 0; i < dArr.getSize(); i++ ) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(dArr.getValue(i));
        }

        System.out.println("Done\n");

        dArr.insertValue(2, "before gotcha");
        for (int i = 0; i < dArr.getSize(); i++ ) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(dArr.getValue(i));
        }
    }
}
