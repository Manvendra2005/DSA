class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int d) {
        data = d;
        next = null;
    }
}

class Queue {
    QueueNode head = null;

    void enqueue(int d) {
        QueueNode newNode = new QueueNode(d);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        } else {
            QueueNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void dequeue() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        } else {
            head = head.next;
        }
    }

    void display() {
        QueueNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}

