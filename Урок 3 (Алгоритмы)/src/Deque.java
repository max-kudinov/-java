public class Deque {
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public Deque(int maxSize) {
        array = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addLeft(int value) {
        if(front == 0) front = array.length;
        array[--front] = value;
        size++;
    }

    public void addRight(int value) {
        if(rear == array.length - 1) rear = -1;
        array[++rear] = value;
        size++;
    }

    public int removeLeft() {
        int value = array[front++];
        if(front == array.length) front = 0;
        size--;
        return value;
    }

    public int removeRight() {
        int value = array[rear--];
        if(rear == -1) rear = array.length - 1;
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

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public int getSize() {
        return size;
    }
}

