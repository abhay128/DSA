package Trees;

/*
For simplicity purpose we will start storing tree from index 1, i.e. root node will be at index 1

left child = 2 * parent_index
right child = 2 * parent_index + 1
 */
public class BinaryTreeUsingArray {

    String[] binaryTreeArray;
    int lastUsedINdex;

    public BinaryTreeUsingArray(int size){
        binaryTreeArray = new String[size + 1];
        this.lastUsedINdex = 0;
        System.out.println(" Binary tree of size " + size + " has been created");
    }
}
