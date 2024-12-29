import Trees.BinaryTreeUsingArray;
import Trees.BinaryTreeUsingLinkedList;
import Trees.TreeNode;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("\n");

        int size = 15;
        BinaryTreeUsingArray binaryTreeUsingArray = new BinaryTreeUsingArray(size);

        binaryTreeUsingArray.insertNode("N1");
        binaryTreeUsingArray.insertNode("N2");
        binaryTreeUsingArray.insertNode("N3");
        binaryTreeUsingArray.insertNode("N4");
        binaryTreeUsingArray.insertNode("N5");
        binaryTreeUsingArray.insertNode("N6");
        binaryTreeUsingArray.insertNode("N7");
        binaryTreeUsingArray.insertNode("N8");
        binaryTreeUsingArray.insertNode("N9");


        System.out.println(" Pre-Order Traversal : ");
        binaryTreeUsingArray.preOrderTraversal(1);
        System.out.println("\n In-Order Traversal : ");
        binaryTreeUsingArray.inOrderTraversal(1);
        System.out.println("\n Post-Order Traversal : ");
        binaryTreeUsingArray.postOrderTraversal(1);
        System.out.println("\n Level-Order Traversal : ");
        binaryTreeUsingArray.levelOrderTraversal();

        binaryTreeUsingArray.search("N5");
        binaryTreeUsingArray.search("5");

        binaryTreeUsingArray.deleteNode("5");
        binaryTreeUsingArray.deleteNode("N4");

        System.out.println("\n Level-Order Traversal : ");
        binaryTreeUsingArray.levelOrderTraversal();


    }
}