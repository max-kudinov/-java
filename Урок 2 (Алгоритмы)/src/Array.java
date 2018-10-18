public class Array {
    private int[] array;
    private int size;

    public Array(int size) {
        array = new int[size];
        this.size = 0;
    }

    public void fillRand() {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            size++;
        }
    }

    public void copyArr(Array arr) {
        if (this.array.length == arr.array.length) {
            for(int i = 0; i < arr.array.length; i++) {
                arr.array[i] = this.array[i];
                arr.size++;
            }
        }
    }

    public boolean addElement(int value) {
        if(isFull()) return false;
        array[size++] = value;
        return true;
    }

    public boolean deleteElement(int value) {
        int position = findElement(value);
        if(position == -1) return false;
        for(int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public int findElement(int value) {
        for(int i = 0; i < size; i++) {
            if(array[i] == value) return i;
        }
        return -1;
    }

    public boolean isFull() {
        if(array.length == size) return true;
        return false;
    }

    public void sortBubble() {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) change(j, j + 1);
            }
        }
    }

    public void sortSelect() {
        for(int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minElementIndex]) minElementIndex = j;
            }
            change(i, minElementIndex);
        }
    }

    public void sortInsert() {
        int in, out;
        for(out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while(in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = temp;
        }
    }

    private void change(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
