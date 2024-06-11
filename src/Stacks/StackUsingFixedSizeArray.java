package Stacks;

public class StackUsingFixedSizeArray {
    private int capacity;           // store array capacity
    private int top;                // store array index of the top element
    private int[] integerStack;     // declare integer array for the stack

    public StackUsingFixedSizeArray(int capacity) {     // Initialize
        this.capacity = capacity;
        this.top = -1;
        this.integerStack = new int[capacity];
    }

    public void display(){
        for(int i = 0 ; i<= top ; i++){
            System.out.print(integerStack[i] + " -> ");
        }
        System.out.println(" Top ");
    }
    public void push(int data){

        if(top >= capacity - 1){            // check for stack overflow
            System.out.println(" ***** Stack Overflow *****");
        }else{
            top++;
            integerStack[top] = data;
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println(" ***** Stack Underflow *****");
        }else{
            top--;
        }
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == capacity - 1){
            return true;
        }
        return false;
    }

    public void deleteStack(){
        top = -1;
        integerStack = null;
    }

    public int top(){
        if(top != -1){
            return integerStack[top];
        }
        System.out.println("Stack is empty");
        return -1;
    }

}
/*

Sample main function for various test cases

 public static void main(String[] args) {
        int stackCapacity = 5;
        StackUsingFixedSizeArray stack = new StackUsingFixedSizeArray(stackCapacity);
        stack.display();
        System.out.println("Stack size : " + stack.size());
        System.out.println("Stack is empty : " + stack.isEmpty());
        System.out.println("Stack is full : " + stack.isFull());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display();

        System.out.println("Stack top : " + stack.top());
        System.out.println("Stack size : " + stack.size());
        System.out.println("Stack is empty : " + stack.isEmpty());
        System.out.println("Stack is full : " + stack.isFull());

        stack.push(4);
        stack.push(5);

        stack.display();

        System.out.println("Stack top : " + stack.top());
        System.out.println("Stack size : " + stack.size());
        System.out.println("Stack is empty : " + stack.isEmpty());
        System.out.println("Stack is full : " + stack.isFull());

        stack.push(6);
        stack.display();

        stack.pop();
        stack.display();
        System.out.println("Stack top : " + stack.top());
        System.out.println("Stack size : " + stack.size());
        System.out.println("Stack is empty : " + stack.isEmpty());
        System.out.println("Stack is full : " + stack.isFull());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack top : " + stack.top());
        System.out.println("Stack size : " + stack.size());
        System.out.println("Stack is empty : " + stack.isEmpty());
        System.out.println("Stack is full : " + stack.isFull());

        stack.pop();

    }

 */
