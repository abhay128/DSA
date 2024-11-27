package Queue;

public class LinearQueueUsingArray {

    public int beginningOfQueue;
    public int topOfQueue;
    public int[] integerQueue;
    public int capacity;


    public LinearQueueUsingArray(int capacity){
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        this.capacity = capacity;
        this.integerQueue = new int[capacity];
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i = beginningOfQueue ; i<= topOfQueue ; i++){
            System.out.print(integerQueue[i] + " -> ");
        }
        System.out.println(" END ");
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(beginningOfQueue == -1){
            beginningOfQueue += 1;
        }
        topOfQueue += 1;
        integerQueue[topOfQueue] = value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        beginningOfQueue += 1;
        return true;

    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return integerQueue[beginningOfQueue];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return integerQueue[topOfQueue];
    }

    public boolean isEmpty() {
        if(beginningOfQueue == -1 && topOfQueue == -1){
            System.out.println("The Queue is Empty.");
            return true;
        }else if(beginningOfQueue > topOfQueue){
            System.out.println("The Queue is Empty.");
            return true;
        } else if (beginningOfQueue == capacity) {
            System.out.println("The Queue is Empty.");
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(topOfQueue == capacity - 1 ){
            System.out.println("The Queue is Full.");
            return true;
        }
        return false;
    }

    public int size(){
        if(beginningOfQueue != topOfQueue)
            return topOfQueue - beginningOfQueue + 1;
        return 1;
    }

}
