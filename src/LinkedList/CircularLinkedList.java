package LinkedList;

public class CircularLinkedList {

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public ListNode getNext() {
            return next;
        }
        public void setNext(ListNode next) {
            this.next = next;
        }
    }
    ListNode head;

    public void display(){
        ListNode current = head;
        while(current.getNext() != head){
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println(current.getData() + " -> " + " END");
    }
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.setNext(newNode);
        if(head == null){
            head = newNode;
        }else{
            ListNode current = head;
            newNode.setNext(head);
            while(current.getNext() != head){
                current = current.getNext();
            }
            current.setNext(newNode);
            head =  newNode;

        }
    }
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        newNode.setNext(newNode);
        if(head == null){
            head = newNode;
        }else{
            ListNode current = head;
            while(current.getNext() != head){
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
        }
    }
    public void deleteAtHead() {
        if(head == null){
            return;
        } else if (head.getNext() == head) {
            head = null;
            return;
        }
        ListNode current = head;
        while(current.getNext() != head){
            current = current.getNext();
        }
        current.setNext(head.getNext());
        head = head.getNext();
    }
    public void deleteAtTail() {
        if(head == null){
            return;
        } else if (head.getNext() == head) {
            head = null;
            return;
        }
        ListNode current = head;
        while(current.getNext().getNext() != head){
            current = current.getNext();
        }
        current.setNext(head);
    }
}

// Sample main function to run
//public static void main(String[] args) {
//
//    CircularLinkedList cll = new CircularLinkedList();
//    cll.addAtHead(1);
//    cll.addAtHead(2);
//    cll.addAtHead(3);
//
//    cll.addAtTail(4);
//
//    cll.display();
//
//    cll.deleteAtHead();
//
//    cll.display();
//
//    cll.deleteAtTail();
//
//    cll.display();
//
//}
