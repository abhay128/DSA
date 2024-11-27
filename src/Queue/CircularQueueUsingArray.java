package Queue;

public class CircularQueueUsingArray {

    public int beginningOfQueue;
    public int topOfQueue;
    public int[] integerQueue;
    public int capacity;


    public CircularQueueUsingArray(int capacity){                               //Time Complexity : O(1) , Space Complexity: O(N)
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        this.capacity = capacity;
        this.integerQueue = new int[capacity];
    }
    public void display(){                                                      //Time Complexity : O(N) , Space Complexity: O(1)
        if(isEmpty()){
            return;
        }
        int size = size();
        int position = beginningOfQueue;
        for(int i = 0 ; i< size ; i++){
            if(position == capacity){
                position = 0;
            }
            System.out.print(integerQueue[position] + " -> ");
            position ++;
        }
        System.out.println(" END ");
    }

    public boolean enQueue(int value) {                                         //Time Complexity : O(1) , Space Complexity: O(1)
        if(isFull()){
            return false;
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue ++;
            integerQueue[topOfQueue] = value;
        }else {                                                                 //Implemented for circular queue
            if(topOfQueue + 1 == capacity){
                topOfQueue = 0;
            }else{
                topOfQueue ++;
            }
            integerQueue[topOfQueue] = value;
        }
        return true;
    }

    public boolean deQueue() {                                                  //Time Complexity : O(1) , Space Complexity: O(1)
        if(isEmpty()){
            return false;
        }else{                                                                  //Implemented for circular queue
            integerQueue[beginningOfQueue] = -1;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }else if(beginningOfQueue + 1 == capacity){
                beginningOfQueue = 0;
            }else{
                beginningOfQueue += 1;
            }
        }
        return true;
    }

    public int Front() {                                                        //Time Complexity : O(1) , Space Complexity: O(1)
        if(isEmpty()){
            return -1;
        }
        return integerQueue[beginningOfQueue];
    }

    public int Rear() {                                                         //Time Complexity : O(1) , Space Complexity: O(1)
        if(isEmpty()){
            return -1;
        }
        return integerQueue[topOfQueue];
    }

    public boolean isEmpty() {                                                  //Time Complexity : O(1) , Space Complexity: O(1)
        if(beginningOfQueue == -1){
            System.out.println("The Queue is Empty.");
            return true;
        }else{
            return false;
        }

    }

    public boolean isFull() {                                                   //Time Complexity : O(1) , Space Complexity: O(1)
        if(topOfQueue + 1 == beginningOfQueue ){
            System.out.println("The Queue is Full.");
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue + 1 == capacity ){
            System.out.println("The Queue is Full.");
            return true;
        }
        return false;
    }

    public int size(){                                                          //Time Complexity : O(1) , Space Complexity: O(1)
        if(beginningOfQueue != topOfQueue){
            if(topOfQueue < capacity && beginningOfQueue < topOfQueue){         // both index in same block
                return topOfQueue - beginningOfQueue + 1;
            }else {                                                             //index of top of queue is behind index of beginning of queue in array
                return (capacity - 1 - beginningOfQueue) + (topOfQueue + 1);
            }
        }
        return 1;
    }

}
