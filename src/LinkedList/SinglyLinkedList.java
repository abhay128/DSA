package LinkedList;

public class SinglyLinkedList {

    ListNode head;

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


    public void display(){

        ListNode node = head;
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println(" END");

    }

    public int get(int index) {
        ListNode node = head;
        int position = 0;
        int val = -1;
        while(node != null){
            if(position == index){
                val = node.value;
                return val;
            }
            node = node.next;
            position ++;
        }
        return val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }
    public void addAtTail(int val) {
        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode node = head;

        while(node.next != null){
            node = node.next;
        }
        node.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        ListNode node = head;
        int position = 0;
        if(index == 0){
            addAtHead(val);
            return;
        }
        while(node != null){
            if(position == index - 1){
                ListNode newNode = new ListNode(val);
                newNode.next = node.next;
                node.next = newNode;
                return;
            }
            position++;
            node = node.next;
        }
        System.out.println("Index out of bounds");
    }

    public void deleteAtIndex(int index) {
        ListNode node = head;
        int position = 0;
        if(index == 0){
            head = head.next;
            return;
        }
        while(node != null){

            if(position == index - 1) {
                if (node.next != null){
                    node.next = node.next.next;
                }else{
                    node.next = null;
                }
                return;
            }
            position++;
            node = node.next;
        }
        System.out.println("Index out of bounds");
    }

}

/*

Sample main function

public static void main(String[] args) {

    LinkedList.SinglyLinkedList sll = new LinkedList.SinglyLinkedList();
    sll.addAtHead(1);
    sll.addAtTail(3);
    sll.addAtIndex(1,2);
    System.out.println("value at index 1 is : " + sll.get(1));
    sll.deleteAtIndex(0);
    System.out.println("value at index 0 is : " + sll.get(0));

//        sll.addAtHead(2);
//        sll.addAtHead(1);
//        sll.addAtIndex(3,0);
//        sll.deleteAtIndex(2);
//        sll.addAtHead(6);
//        sll.addAtTail(4);
//        System.out.println("value at index 4 is : " + sll.get(4));
//        sll.addAtHead(4);
//        sll.addAtIndex(5,0);
//        sll.addAtHead(6);

    //  6  1  2    0  4

    sll.display();

//        System.out.println("value at index 3 is : " + sll.get(3));



}*/
