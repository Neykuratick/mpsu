public class DynamicArray<T> {
    private T[] data;
    private int DEFAULT_SIZE = 5;
    private int size;
    private String wrongIndexError = "Wrong index";

    public DynamicArray() {
        data = (T[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int size) {
        data = (T[]) new Object[size];
        this.size = size;
    }

    public void setValue(int index, T value) {
        if (index >= 0 && index <= this.size) {
            data[index] = value;
        } else {
            throw new RuntimeException(wrongIndexError);
        }
    }

    public T getValue(int index) {
        if (index >= 0 && index <= this.size) {
            return data[index];
        } else {
            throw new RuntimeException(wrongIndexError);
        }
    }

    public int getLength() {
        return data.length;
    }
}
