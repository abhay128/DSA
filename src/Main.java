import LinkedList.DoublyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList sll = new DoublyLinkedList();
        sll.addAtHead(1);
        sll.addAtHead(2);
        sll.addAtHead(3);


        sll.addAtTail(4);

        sll.addAtIndex(1,7);

        sll.addAtIndex(0,0);
//
        sll.addAtIndex(8,6);



        sll.display();

        System.out.println("value at index 3 is : " + sll.get(3));



    }
}