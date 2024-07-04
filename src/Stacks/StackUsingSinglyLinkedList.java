package Stacks;

import LinkedList.SinglyLinkedList;

import java.util.List;

public class StackUsingSinglyLinkedList {

    private ListNode top;                // store last element added to list in other words tail
    private ListNode head;
    private int size;

    private class ListNode{

        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public StackUsingSinglyLinkedList() {     // Initialize
        this.size = 0;
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }
    public void push(int data){
        if(head == null){
            head = new ListNode(data);

        }else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new ListNode(data);
        }
        size++;
    }

    public void pop(){
        if(head == null){
            System.out.println(" *********** Stack Underflow ***********");
        }else if(head.next == null)
        {
            head = null;
        }else{
            ListNode temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;


    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public boolean isFull(){

        return false;
    }

    public void deleteStack(){
        head = null;
        size = 0;
    }

    public int top(){
        if(head != null){
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            return temp.value;
        }
        System.out.println("Stack is empty");
        return -1;
    }
}

//public static void main(String[] args) {
//    int stackCapacity = 1;
//    StackUsingSinglyLinkedList stack = new StackUsingSinglyLinkedList();
//    stack.display();
//    System.out.println("Stack size : " + stack.size());
//    System.out.println("Stack is empty : " + stack.isEmpty());
//    System.out.println("Stack is full : " + stack.isFull());
//
//    stack.push(1);
//    stack.display();
//    System.out.println("Stack size : " + stack.size());
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
////
////        stack.push(6);
////        stack.display();
////
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