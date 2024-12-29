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

    public void preOrderTraversal(int index){                   //Time Complexity : O(N) , Space Complexity: O(N)
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(binaryTreeArray[index] + " ");                 // Root                     O(1)
        preOrderTraversal(index * 2);                             // Left Child               O(N/2)
        preOrderTraversal(index * 2 + 1);                         // Right Child              O(N/2)
    }

    public void inOrderTraversal(int index){                   //Time Complexity : O(N) , Space Complexity: O(N)
        if(index > lastUsedIndex){
            return;
        }
        inOrderTraversal(index * 2);                             // Left Child
        System.out.print(binaryTreeArray[index] + " ");                // Root
        inOrderTraversal(index * 2 + 1);                         // Right Child
    }

    public void postOrderTraversal(int index){                   //Time Complexity : O(N) , Space Complexity: O(N)
        if(index > lastUsedIndex){
            return;
        }
        postOrderTraversal(index * 2);                             // Left Child
        postOrderTraversal(index * 2 + 1);                         // Right Child
        System.out.print(binaryTreeArray[index] + " ");                  // Root
    }

    public void levelOrderTraversal(){                          //Time Complexity : O(N) , Space Complexity: O(1)
        for(int i=1; i <=lastUsedIndex ; i++){
            System.out.print(binaryTreeArray[i] + " ");
        }
    }

    public int search(String value){                            //Time Complexity : O(N) , Space Complexity: O(1)
        for (int i=1 ; i<lastUsedIndex; i++ ){
            if(binaryTreeArray[i] == value){
                System.out.println("\n The Node " + value + " exists in a tree at index " + i);
                return i;
            }
        }
        System.out.println("\n The Node " + value + " does not exists in a tree. ");
        return -1;
    }

    public void deleteNode(String value){                       //Time Complexity : O(N) , Space Complexity: O(1)
        int location = search(value);           // find index of node to delete
        if(location == -1){                     // if not found return
            return;
        }else{
            binaryTreeArray[location] = binaryTreeArray[lastUsedIndex];     // update the value of node to be deleted to deepest node
            lastUsedIndex--;                                                // delete the deepest node
            System.out.println("\n The node successfully deleted");
        }
    }
}
