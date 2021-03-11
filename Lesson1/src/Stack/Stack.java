package Stack;

import Arrays.DynamicArray;

public class Stack<T> {
    int size = 0;
    DynamicArray array = new DynamicArray();

    public void push(T data) {
        array.addValue(data);
    }
}
