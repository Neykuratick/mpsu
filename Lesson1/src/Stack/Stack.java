package Stack;

import Arrays.DynamicArray;

public class Stack<T> {
    int size = 0;
    DynamicArray array = new DynamicArray(0);

    public void push(T data) {
        array.addValue(data);
        size++;
    }

    public Object peek() {
        // returns the last item in the stack

        return array.getValue(size-1);
    }
}
