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

}
