import java.util.Arrays;

public class DynamicArray<T> {
    private T[] data;
    private int size;

    private int DEFAULT_SIZE = 5;
    private final String wrongIndexError = "Wrong index";

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

    public void resize(int newSize) {
        if (newSize >= 0) {
            this.data = Arrays.copyOf(data, newSize);
            this.size = newSize;
        } else {
            throw new RuntimeException("Size of the array must be over 0");
        }
    }

    public T getValue(int index) {
        if (index >= 0 && index < this.size) {
            return data[index];
        } else {
            throw new RuntimeException(wrongIndexError);
        }
    }

    public int getLength() {
        return data.length;
    }
}
