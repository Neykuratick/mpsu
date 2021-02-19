public class Main {
    public static void main(String args[]) {
        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        for (int i = 0; i < dArr.getSize(); i++ ) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(dArr.getValue(i));
        }
        System.out.println(dArr.getSize());

        System.out.println("Done\n");



        System.out.println(dArr.findFirst(2));
    }
}
