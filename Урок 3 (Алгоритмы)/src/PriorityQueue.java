public class PriorityQueue {
    private int[] array;
    private int size;

    public PriorityQueue(int maxSize) {
        array = new int[maxSize];
        size = 0;
    }

    public void insert(int value) {
        int i;
        if(isEmpty()) {
            array[size++] = value;
        }
        else {
            for(i = size - 1; i >= 0; i--) {
                if(array[i] < value) {
                    array[i + 1] = array[i];
                }
                else break;
            }
            array[i + 1] = value;
            size++;
        }
    }

    public int remove() {
        return array[--size];
    }

    public int peek() {
        return array[size - 1];
    }

    public void display() {
        while(!isEmpty()) {
            System.out.println(remove());
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
