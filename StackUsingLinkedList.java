class StackNode {
    int data;
    StackNode next;

    StackNode(int d) {
        data = d;
        next = null;
    }
}

class Stack {
    StackNode head = null;

    void push(int d) {
        StackNode newNode = new StackNode(d);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        } else {
            StackNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void pop() {
        if (head == null) {
            System.out.println("Stack is Empty!");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            StackNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void display() {
        StackNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
        obj.pop();
        obj.display();
    }
}
