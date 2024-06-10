package LinkedList;

class ListNode{

    private int value;
    private ListNode next;
    private ListNode previous;

    public ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }
}
public class DoublyLinkedList {
    ListNode head;
    public void display(){

        ListNode node = head;
        while (node != null){
            System.out.print(node.getValue() + " <=> ");
            node = node.getNext();
        }
        System.out.println(" END");

    }

    public int get(int index) {

        ListNode node = head;
        int counter = 0;

        while (node != null){
            if(counter == index){
                return node.getValue();
            }
            node = node.getNext();
            counter ++;
        }

        return -1;
    }

    public void addAtHead(int val) {

        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode node = new ListNode(val);
        node.setNext(head);
        head.setPrevious(node);
        head = node;

    }

    public void addAtTail(int val) {

        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode current = head;

        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);
        node.setPrevious(current);

    }

    public void addAtIndex(int index, int val) {

        ListNode current = head;
        int position = 0;

        if(index == 0){
            addAtHead(val);
            return;
        }
        while(current != null){
            if(position == index - 1){

                ListNode newNode = new ListNode(val);
                if(current.getNext() != null){
                    newNode.setNext(current.getNext());
                    current.getNext().setPrevious(newNode);
                }
                newNode.setPrevious(current);
                current.setNext(newNode);
                return;

            }
            position++;
            current = current.getNext();

        }
        System.out.println("Index out of bounds");

    }

    public void deleteAtIndex(int index) {
        ListNode current = head;
        int position = 0;
        if(index == 0){
            head = head.getNext();
            return;
        }
        while(current != null){
            if(position == index){
                if(current.getNext() != null){
                    current.getNext().setPrevious(current.getPrevious());
                }
                current.getPrevious().setNext(current.getNext());
                return;
            }
            position++;
            current = current.getNext();
        }
        System.out.println("Index out of bounds");


    }

}

//public static void main(String[] args) {
//
//    DoublyLinkedList sll = new DoublyLinkedList();
//    sll.addAtHead(1);
//    sll.addAtHead(2);
//    sll.addAtHead(3);

//    sll.addAtTail(4);
//
//    sll.addAtIndex(1,7);
//
//    sll.addAtIndex(0,0);
////
//    sll.addAtIndex(8,6);

//    sll.display();
//
//    System.out.println("value at index 3 is : " + sll.get(3));
//}
