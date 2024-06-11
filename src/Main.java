
import Stacks.StackUsingFixedSizeArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
}