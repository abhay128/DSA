package Trees;

/*
For simplicity purpose we will start storing tree from index 1, i.e. root node will be at index 1

left child = 2 * parent_index
right child = 2 * parent_index + 1
 */
public class BinaryTreeUsingArray {

    String[] binaryTreeArray;
    int lastUsedIndex;

    public BinaryTreeUsingArray(int size){                           //Time Complexity : O(1) , Space Complexity: O(N)
        binaryTreeArray = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println(" Binary tree of size " + size + " has been created");
    }

    public boolean isFull(){                                        //Time Complexity : O(1) , Space Complexity: O(1)
        if(lastUsedIndex == binaryTreeArray.length - 1){
            return true;
        }else{
            return false;
        }
    }
    public void insertNode(String value){                           //Time Complexity : O(1) , Space Complexity: O(1)
        if(!isFull()){
            lastUsedIndex += 1;
            binaryTreeArray[lastUsedIndex] = value;
            System.out.println("The value of " + value + " has been added");
        }else{
            System.out.println("The Binary Tree is full");
        }
    }
}
