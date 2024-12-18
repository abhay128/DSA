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

/*
public static void main(String[] args) {

        LinearQueueUsingLinkedList queue = new LinearQueueUsingLinkedList();
        queue.display();

//        System.out.println("queue is empty : " + queue.isEmpty());
//        System.out.println("queue is full : " + queue.isFull());

        queue.enQueue(1);
//        queue.display();
//        System.out.println("queue size : " + queue.size());

        queue.enQueue(2);
//        queue.display();
//        System.out.println("queue size : " + queue.size());


        queue.enQueue(3);

//        queue.display();
//        System.out.println("queue size : " + queue.size());
//
//        queue.display();
//
//        System.out.println("queue Front : " + queue.Front());
//        System.out.println("queue Rear : " + queue.Rear());
//        System.out.println("queue size : " + queue.size());
//        System.out.println("queue is empty : " + queue.isEmpty());
//        System.out.println("queue is full : " + queue.isFull());

        queue.enQueue(4);
        queue.enQueue(5);

        queue.display();

//        System.out.println("queue Front : " + queue.Front());
//        System.out.println("queue Rear : " + queue.Rear());
//        System.out.println("queue size : " + queue.size());
//        System.out.println("queue is empty : " + queue.isEmpty());
//        System.out.println("queue is full : " + queue.isFull());
//
//        queue.enQueue(6);
//        queue.display();
//
        queue.deQueue();
        queue.display();
//        System.out.println("queue Front : " + queue.Front());
//        System.out.println("queue Rear : " + queue.Rear());
//        System.out.println("queue size : " + queue.size());
//        System.out.println("queue is empty : " + queue.isEmpty());
//        System.out.println("queue is full : " + queue.isFull());

//        queue.deQueue();
//       queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.display();

        System.out.println("queue Front : " + queue.Front());
        System.out.println("queue Rear : " + queue.Rear());
        System.out.println("queue size : " + queue.size());

        queue.deQueue();
        queue.deQueue();
        queue.display();

        System.out.println("queue is empty : " + queue.isEmpty());


        queue.deQueue();
        queue.enQueue(5);

        queue.display();

    }
 */
