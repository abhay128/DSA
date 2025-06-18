import Trees.*;

import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        BinarySearchTree binaryTree = new BinarySearchTree();
        BinaryTreeNode BinaryTreeNode1 = new BinaryTreeNode();
        BinaryTreeNode1.data = 100;
        BinaryTreeNode BinaryTreeNode2 = new BinaryTreeNode();
        BinaryTreeNode2.data = 20;
        BinaryTreeNode BinaryTreeNode3 = new BinaryTreeNode();
        BinaryTreeNode3.data = 500;
        BinaryTreeNode BinaryTreeNode4 = new BinaryTreeNode();
        BinaryTreeNode4.data = 10;
        BinaryTreeNode BinaryTreeNode5 = new BinaryTreeNode();
        BinaryTreeNode5.data = 30;

        BinaryTreeNode1.left = BinaryTreeNode2;
        BinaryTreeNode1.right = BinaryTreeNode3;

        BinaryTreeNode2.left = BinaryTreeNode4;
        BinaryTreeNode2.right = BinaryTreeNode5;

        // BinaryTreeNode5.left = BinaryTreeNode11;

        binaryTree.root = BinaryTreeNode1;




        System.out.println("\n");

        System.out.println("Inorder Traversal : " );
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println("\n" +"Preorder Traversal : " );
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println("\n" +"Postorder Traversal : " );
        binaryTree.postorderTraversal(binaryTree.root);

        System.out.println("\n" +"Level Order Traversal : " );
        binaryTree.levelorderTraversal(binaryTree.root);

        System.out.println("\n\n");
        System.out.println("Insert new Node 40");
        binaryTree.root = binaryTree.insert(binaryTree.root, 40);

        System.out.println("\n" +"Level Order Traversal : " );
        binaryTree.levelorderTraversal(binaryTree.root);

        System.out.println("\n\n");
        System.out.println("Delete new Node 40");
        binaryTree.delete(binaryTree.root, 40);

        System.out.println("\n" +"Level Order Traversal : " );
        binaryTree.levelorderTraversal(binaryTree.root);

        System.out.println("\n\n");
     
    }
}