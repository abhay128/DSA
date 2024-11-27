package Queue;

public class LinearQueueUsingLinkedList {


    public ListNode head;
    public int size;
    public ListNode tail;

    public class ListNode {

        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        public ListNode (int data, ListNode next){
            this.data = data;
            this.next = next;
        }

    }
    public LinearQueueUsingLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }

    public boolean enQueue(int value) {

        if(head == null){
            head = new ListNode(value);
            tail = head;
        }else{
            ListNode temp = new ListNode(value);
            tail.next = temp;
            tail = temp;
        }
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            System.out.println(" Queue is Empty");
            return false;
        }else if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return true;
        }else{
            head = head.next;
            size--;
            return true;
        }
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return tail.data;
    }

    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }

}
