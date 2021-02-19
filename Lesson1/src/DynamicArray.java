public class DynamicArray<T> {
    private T[] data;
    private int DEFAULT_SIZE = 5;
    private int size;

    public DynamicArray() {
        data = (T[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int size) {
        data = (T[]) new Object[size];
        this.size = size;
    }

    public int getLength() {
        return data.length;
    }
}
