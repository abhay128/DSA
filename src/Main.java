
import Queue.CircularQueueUsingArray;
import Queue.LinearQueueUsingArray;
import Queue.LinearQueueUsingLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
}