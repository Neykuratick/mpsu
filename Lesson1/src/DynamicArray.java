import java.util.Arrays;

public class DynamicArray<T> {
    private T[] data;
    private int size;

    private int DEFAULT_SIZE = 5;
    public static String wrongIndexError = "Wrong index";
    public static String negativeArraySizeError = "Size of the array must be over -1";
    public static String noSuchElementError = "Value not found";

    public DynamicArray() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public DynamicArray(int size) {
        if (size >= 0) {
            data = (T[]) new Object[size];
            this.size = size;
        } else {
            throw new RuntimeException(negativeArraySizeError);
        }
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
            throw new RuntimeException(negativeArraySizeError);
        }
    }

    public void addValue(T value) {
        int oldLastIndex = this.size;
        resize(this.size + 1);
        setValue(oldLastIndex, value);
    }

    public T getValue(int index) {
        if (index >= 0 && index < this.size) {
            return data[index];
        } else {
            throw new RuntimeException(wrongIndexError);
        }
    }

    public int getSize() {
        return data.length;
    }

    public int findFirst(T requiredElement) {
        int counter = 0;

        for (T element : this.data) {
            if (element == requiredElement) {
                return counter;
            }
            counter++;
        }

        throw  new RuntimeException(noSuchElementError);
    }

    public int findLast(T requiredElement) {
        int counter = 0;
        int rightIndex = -1;

        for (T element : this.data) {
            if (element == requiredElement) {
                rightIndex = counter;
            }
            counter++;
        }

        if (rightIndex >= 0) {
            return rightIndex;
        } else {
            throw  new RuntimeException(noSuchElementError);
        }
    }
}
