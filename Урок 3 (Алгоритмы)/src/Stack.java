public class Stack {
    private char[] array;
    private int size;

    public Stack(int maxSize) {
        array = new char[maxSize];
        size = 0;
    }

    public void push(char value) {
        array[size++] = value;
    }

    public char pop() {
        return array[--size];
    }

    public char peek() {
        return array[size - 1];
    }

    public boolean isFull() {
        return size == array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
