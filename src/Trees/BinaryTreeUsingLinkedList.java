package Trees;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLinkedList {

    public TreeNode root;
    public BinaryTreeUsingLinkedList(){                         //Time Complexity : O(1) , Space Complexity: O(1)
        this.root = null;
    }

    public void preorderTraversal(TreeNode node){               //Time Complexity : O(n) , Space Complexity: O(n)
        if(node != null){
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }

    }

    public void inorderTraversal(TreeNode node){                //Time Complexity : O(n) , Space Complexity: O(n)
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }

    }

    public void postorderTraversal(TreeNode node){              //Time Complexity : O(n) , Space Complexity: O(n)
        if(node != null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " ");
        }

    }

    public void levelorderTraversal(TreeNode root){             //Time Complexity : O(n) , Space Complexity: O(n)
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.print(node.value + " ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }

    }

    public void search(String value){                           //Time Complexity : O(n) , Space Complexity: O(n)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("The value - " + value + " is present in the tree");
                return;
            }else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value - " + value + " is not present in the tree");
    }

    public void insertNode(String value){                       //Time Complexity : O(n) , Space Complexity: O(n)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode newNode =  new TreeNode();
        newNode.value = value;

        if(root == null){
            root = newNode;
            return;
        }
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node.left != null){
                queue.add(node.left);
            }else{
                node.left = newNode;
                return;
            }
            if(node.right != null){
                queue.add(node.right);
            }else{
                node.right = newNode;
                return;
            }
        }
    }

    public void deleteNode(String valueTodelete){                   //Time Complexity : O(n) , Space Complexity: O(n)

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        if(root == null){
            System.out.println("Tree is Empty");
        }
        TreeNode nodeToBeDeleted = new TreeNode();
        TreeNode deepestNode = new TreeNode();

        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            deepestNode = node;
            if(node.value == valueTodelete)
            {
                nodeToBeDeleted = node;
            }
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }

        }
        if(nodeToBeDeleted.value != valueTodelete){
            System.out.println("Node to be delete does not exist in the tree");
        }else{
            deleteDeepestNode(deepestNode.value);
            nodeToBeDeleted.value = deepestNode.value;

            System.out.println("Node is successfully deleted");
        }

    }
    public void deleteDeepestNode(String deepestNode){                  //Time Complexity : O(n) , Space Complexity: O(n)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.remove();

            if(currentNode.value == deepestNode){
                currentNode = null;
                return;
            }
            if(currentNode.right != null){

                if(currentNode.right.value == deepestNode){
                    currentNode.right = null;
                    return;
                }
                queue.add(currentNode.right);
            }
            if(currentNode.left != null){
                if(currentNode.left.value == deepestNode){
                    currentNode.left = null;
                    return;
                }
                queue.add(currentNode.left);
            }
        }


    }

    public void deleteBinaryTree(){                                 //Time Complexity : O(1) , Space Complexity: O(1)
        root = null;
        System.out.println("\n Binary tree is successfully deleted");
    }

}

/*
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

        TreeNode treeNode11 = new TreeNode();
        treeNode11.value = "11";

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode4.left = treeNode8;

        treeNode6.left = treeNode9;
        treeNode6.right = treeNode10;

       // treeNode5.left = treeNode11;

        binaryTree.root = treeNode1;




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
        binaryTree.search("1");
        binaryTree.search("4");
        binaryTree.search("10");
        binaryTree.search("15");
        System.out.println("\n\n");

        //binaryTree.insertNode("20");
        binaryTree.deleteNode("50");
        binaryTree.deleteNode("3");

        System.out.println("\n" +"Level Order Traversal : " );
        binaryTree.levelorderTraversal(binaryTree.root);

        binaryTree.deleteNode("1");

        System.out.println("\n" +"Level Order Traversal : " );
        binaryTree.levelorderTraversal(binaryTree.root);

        binaryTree.deleteBinaryTree();


    }
 */
