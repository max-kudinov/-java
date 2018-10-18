public class Main {
    public static void main(String[] args) {
        Array arr = new Array(100_000);
        Array arr2 = new Array(100_000);
        Array arr3 = new Array(100_000);

        long startTimer, stopTimer;

        arr.fillRand();
        arr.copyArr(arr2);
        arr.copyArr(arr3);

        startTimer = System.currentTimeMillis();
        arr.sortBubble();
        stopTimer = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (stopTimer - startTimer) + " ms");

        startTimer = System.currentTimeMillis();
        arr2.sortSelect();
        stopTimer = System.currentTimeMillis();
        System.out.println("Select sort: " + (stopTimer - startTimer) + " ms");

        startTimer = System.currentTimeMillis();
        arr3.sortInsert();
        stopTimer = System.currentTimeMillis();
        System.out.println("Insert sort: " + (stopTimer - startTimer) + " ms");
    }
}
