import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        rightToLeft();
        System.out.println("------------");
        testQueue();
        System.out.println("------------");
        testPriorityQueue();
        System.out.println("------------");
        testDequeue();
    }

    public static void rightToLeft() {
        System.out.println("Введите слово");
        String userWord = scan.nextLine();
        Stack stack = new Stack(userWord.length());

        for(int i = 0; i < userWord.length(); i++) {
            stack.push(userWord.charAt(i));
        }

        for(int i = 0; i < userWord.length(); i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void testQueue() {
        Queue queue = new Queue(10);
        queue.add(10);
        queue.add(6);
        queue.display();
        queue.remove();
        queue.add(14);
        queue.add(9);
        queue.display();
        queue.add(20);
        queue.remove();
        queue.display();
    }

    public static void testPriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(4);
        priorityQueue.insert(9);
        priorityQueue.insert(5);
        priorityQueue.insert(2);
        priorityQueue.display();
        System.out.println();
    }

    public static void testDequeue() {
        Deque deque = new Deque(10);
        deque.addLeft(8);
        deque.display();
        deque.addRight(4);
        deque.display();
        deque.addLeft(6);
        deque.display();
        deque.removeLeft();
        deque.display();
        deque.removeRight();
        deque.display();
    }
}
