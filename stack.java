public class stack {
    int[] stack;
    int top ;
    int size ;

    stack(int size)
    {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    boolean isFull(){
        return top == size-1;
    }
    boolean isEmpty(){
        return top == - 1;
    }
    void push(int val){
        if (isFull())
        {
            System.out.println("stack is full");
        }
        else{
            top = top +1;
            stack[top] = val;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(stack[top]);
            top--;
        }
    }
    void peek()
    {
        if(isEmpty()){
            System.out.println("stack is Empty");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            for (int i = 0; i<=top; i++){
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args){
        stack s = new stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.peek();
        s.pop();
        s.push(40);
        s.display();

    }
}
