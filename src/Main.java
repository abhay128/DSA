import LinkedList.CircularLinkedList;
import LinkedList.DoublyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();
        cll.addAtHead(1);
        cll.addAtHead(2);
        cll.addAtHead(3);

        cll.addAtTail(4);

        cll.display();

        cll.deleteAtHead();

        cll.display();

        cll.deleteAtTail();

        cll.display();

    }
}