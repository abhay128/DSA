package Stacks;

public class StackUsingDynamicArray {
    private int capacity;           // store array capacity
    private int top;                // store array index of the top element
    private int[] integerStack;     // declare integer array for the stack

    public StackUsingDynamicArray(int capacity) {     // Initialize
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

        if(top >= capacity - 1) {            // check for stack overflow then double the array size
            capacity = capacity * 2;
            int[] tempArrayStack = new int[capacity];
            System.arraycopy(integerStack, 0, tempArrayStack, 0, capacity / 2);     //copy all the elements from original to new array
            integerStack = tempArrayStack;

        }
            top++;
            integerStack[top] = data;
            System.out.println("\n Array Size = " + integerStack.length);

    }

    public void pop(){
        if(top == -1){
            System.out.println(" ***** Stack Underflow *****");
        }else{
            if(top < capacity/2 ) {             // if the number of elements in a stack are less than half of the array capacity then reduce the capacity by half
                capacity = capacity / 2;
                int[] tempArrayStack = new int[capacity];
                System.arraycopy(integerStack, 0, tempArrayStack, 0, capacity );
                integerStack = tempArrayStack;
                System.out.println("\n Array Size = " + integerStack.length);

            }
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

//public static void main(String[] args) {
//    int stackCapacity = 1;
//    StackUsingDynamicArray stack = new StackUsingDynamicArray(stackCapacity);
//    stack.display();
//    System.out.println("Stack size : " + stack.size());
//    System.out.println("Stack is empty : " + stack.isEmpty());
//    System.out.println("Stack is full : " + stack.isFull());
//
//    stack.push(1);
//    stack.display();
//    System.out.println("Stack size : " + stack.size());
//
//
//
//    stack.push(2);
//    stack.display();
//    System.out.println("Stack size : " + stack.size());
//
//
//    stack.push(3);
//
//    stack.display();
//    System.out.println("Stack size : " + stack.size());
//
//    stack.display();
//
//    System.out.println("Stack top : " + stack.top());
//    System.out.println("Stack size : " + stack.size());
//    System.out.println("Stack is empty : " + stack.isEmpty());
//    System.out.println("Stack is full : " + stack.isFull());
//
//    stack.push(4);
//    stack.push(5);
//
//    stack.display();
//
//    System.out.println("Stack top : " + stack.top());
//    System.out.println("Stack size : " + stack.size());
//    System.out.println("Stack is empty : " + stack.isEmpty());
//    System.out.println("Stack is full : " + stack.isFull());
//
//    stack.push(6);
//    stack.display();
//
//    stack.pop();
//    stack.display();
//    System.out.println("Stack top : " + stack.top());
//    System.out.println("Stack size : " + stack.size());
//    System.out.println("Stack is empty : " + stack.isEmpty());
//    System.out.println("Stack is full : " + stack.isFull());
//
//    stack.pop();
//    stack.pop();
//    stack.pop();
//    stack.pop();
//
//    System.out.println("Stack top : " + stack.top());
//    System.out.println("Stack size : " + stack.size());
//    System.out.println("Stack is empty : " + stack.isEmpty());
//    System.out.println("Stack is full : " + stack.isFull());
//
//    stack.pop();
//
//}