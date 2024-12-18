import Trees.BinaryTreeUsingLinkedList;
import Trees.TreeNode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BinaryTreeUsingLinkedList binaryTree = new BinaryTreeUsingLinkedList();
        TreeNode treeNode1 = new TreeNode();
        treeNode1.value = "1";
        TreeNode treeNode2 = new TreeNode();
        treeNode2.value = "2";
        TreeNode treeNode3 = new TreeNode();
        treeNode3.value = "3";
        TreeNode treeNode4 = new TreeNode();
        treeNode4.value = "4";
        TreeNode treeNode5 = new TreeNode();
        treeNode5.value = "5";
        TreeNode treeNode6 = new TreeNode();
        treeNode6.value = "6";
        TreeNode treeNode7 = new TreeNode();
        treeNode7.value = "7";
        TreeNode treeNode8 = new TreeNode();
        treeNode8.value = "8";
        TreeNode treeNode9 = new TreeNode();
        treeNode9.value = "9";
        TreeNode treeNode10 = new TreeNode();
        treeNode10.value = "10";

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode4.left = treeNode8;

        treeNode6.left = treeNode9;
        treeNode6.right = treeNode10;

        binaryTree.root = treeNode1;

        System.out.println("Inorder Traversal : " );
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println("\n" +"Preorder Traversal : " );
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println("\n" +"Postorder Traversal : " );
        binaryTree.postorderTraversal(binaryTree.root);

        System.out.println("\n" +"Level Order Traversal : " );
        binaryTree.levelorderTraversal(binaryTree.root);

    }
}