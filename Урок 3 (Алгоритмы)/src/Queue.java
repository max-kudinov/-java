public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public Queue(int maxSize) {
        array = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(int value) {
        if(rear == array.length - 1) rear = -1;
        array[++rear] = value;
        size++;
    }

    public int remove() {
        int value = array[front++];
        if(front == array.length) front = 0;
        size--;
        return value;
    }

    public void display() {
        int currentFront = front;
        int currentSize = size;
        while(currentSize > 0) {
            System.out.print(array[currentFront++] + " ");
            if(currentFront == array.length) currentFront = 0;
            currentSize--;
        }
        System.out.println();
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
