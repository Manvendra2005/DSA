import java.util.*;

public class QueueExample {
    static int[] q = new int[100];
    static int size = 5;
    static int front = -1;
    static int rear = -1;

    static boolean isFull() {
        return rear == size - 1;
    }

    static boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    static void enqueue(int value) {
        if (isFull()) {
            System.out.println("Overfull");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = rear + 1;
            q[rear] = value;
        }
    }

    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            int ele = q[front];
            front = front + 1;
            System.out.println(ele + " deleted.");
        }
    }

    static void display() {
        System.out.println("\n");
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
        } else {
            int i = front;
            while (true) {
                System.out.print(q[i] + "  ");
                if (i == rear) {
                    break;
                }
                i = i + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        display();
        dequeue();
        display();
    }
}