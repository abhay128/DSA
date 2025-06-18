package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinaryTreeNode root;

    // Create BST
    //    Time Complexity: O(1)
    //    Space Complexity: O(1)

    public BinarySearchTree() {
        root = null;
    }

    //    Search element in BST - Recursively
    //    Time Complexity: O(n) in worst case when BST is skew tree
    //    Space Complexity: O(n) for recursive stack

    public BinaryTreeNode RecursiveSearch(BinaryTreeNode root, int val){
        if(root == null)
            return null;
        if(val < root.data){
            return RecursiveSearch(root.left, val);
        }
        else if(val > root.data){
            return RecursiveSearch(root.right, val);
        }
        return root;
    }
    //    Search element in BST - Non Recursively
    //    Time Complexity: O(n) in worst case when BST is skew tree
    //    Space Complexity: O(1) for recursive stack

    public BinaryTreeNode NonRecursiveSearch(BinaryTreeNode root, int val){
        if(root == null)
            return null;
        while(root != null){
            if(root.data == val){
                return root;
            }
            else if(val < root.data){
                root = root.left;
            }
            else
                root = root.right;
        }
        return null;
    }


    //    Find minimum element in BST - Recursively
    //    Time Complexity: O(n) in worst case when BST is skew tree
    //    Space Complexity: O(n) for recursive stack

    public BinaryTreeNode RecusiveFindMin(BinaryTreeNode root){
        if(root == null){
            return null;
        }else{
            if(root.left == null)
                return root;
            else
                return RecusiveFindMin(root.left);
        }
    }

    //    Find minimum element in BST - Non Recursively
    //    Time Complexity: O(n) in worst case when BST is skew tree
    //    Space Complexity: O(1) for recursive stack
    public BinaryTreeNode NonRecusiveFindMin(BinaryTreeNode root){
        if(root == null){
            return null;
        }
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //    Find minimum element in BST - Recursively
    //    Time Complexity: O(n) in worst case when BST is skew tree
    //    Space Complexity: O(n) for recursive stack

    public BinaryTreeNode RecusiveFindMax(BinaryTreeNode root){
        if(root == null){
            return null;
        }else{
            if(root.right == null)
                return root;
            else
                return RecusiveFindMax(root.right);
        }
    }

    //    Find minimum element in BST - Non Recursively
    //    Time Complexity: O(n) in worst case when BST is skew tree
    //    Space Complexity: O(1) for recursive stack
    public BinaryTreeNode NonRecusiveFindMax(BinaryTreeNode root){
        if(root == null){
            return null;
        }
        while(root.right != null){
            root = root.right;
        }
        return root;
    }

    public void preorderTraversal(BinaryTreeNode node){               //Time Complexity : O(n) , Space Complexity: O(n)
        if(node != null){
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }

    }

    public void inorderTraversal(BinaryTreeNode node){                //Time Complexity : O(n) , Space Complexity: O(n)
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }

    }

    public void postorderTraversal(BinaryTreeNode node){              //Time Complexity : O(n) , Space Complexity: O(n)
        if(node != null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }

    }

    public void levelorderTraversal(BinaryTreeNode root){             //Time Complexity : O(n) , Space Complexity: O(n)
        if(root == null){
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode node = queue.remove();
            System.out.print(node.data + " ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }

    }

    public BinaryTreeNode insert ( BinaryTreeNode root, int data){
        if(root == null){
            root = new BinaryTreeNode();
            if(root == null){
                System.out.println("Memory Error");
                return null;
            }
            root.data = data;
        }else{
            if(data < root.data){
                root.left = insert(root.left, data);
            } else if (data > root.data) {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public BinaryTreeNode delete (BinaryTreeNode root, int data){
        //Base case
        if(root == null){
            System.out.println("Tree is empty");
            return root;
        }
        // Search key in subtree
        if(root.data > data){
            root.left = delete(root.left, data);
        } else if (root.data < data) {
            root.right = delete(root.right, data);
        }else{
            // if root matched with the given key

            // Cases when root has zero children or
            // only right child
            if(root.left == null){
                return root.right;
            }
            // when root has only left child
            if(root.right == null){
                return root.left;
            }

            BinaryTreeNode successorNode = getInorderSuccessor(root);
            root.data = successorNode.data;
            root.right = delete(root.right, successorNode.data);
        }
        return root;
    }
   public BinaryTreeNode getInorderSuccessor(BinaryTreeNode currentNode){

        currentNode = currentNode.right;

        while(currentNode != null && currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode;
   }
}
