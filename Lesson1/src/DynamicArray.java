public class DynamicArray {
    private int[] data;
    int DEFAULT_SIZE = 5;

    public DynamicArray() {
        data = new int[DEFAULT_SIZE];
    }

    public DynamicArray(int size) {
        data = new int[size];
    }

    public int length() {
        return data.length;
    }
}
