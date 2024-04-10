class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   


   /**
    * Recursive method that will insert the provided value.
    * @param root Root node from Binary Search Tree.
    * @param value Value to be inserted.
    */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }
   
   


   /**
    * Recursive method that prints out the Given Binary search tree in preOrder.
    * @param root Root of binary Search Tree.
    */
   public void preOrderTraversal(Node root){
      //Base Case:
      if (root == null){
         return;
      }

      System.out.printf("%d ", root.value);
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
   }

   
   

   /**
    * Recursive method that prints out the Given Binary search tree inOrder.
    * @param root Root of binary Search Tree.
    */
   public void inOrderTraversal(Node root){
      //Base Case:
      if (root == null){
         return;
      }

      inOrderTraversal(root.left);
      System.out.printf("%d ",root.value);
      inOrderTraversal(root.right);
   }
   
   

   /**
    * Recursive method that prints out the Given Binary search tree in postOrder.
    * @param root Root of binary Search Tree.
    */
   public void postOrderTraversal(Node root){
      //Base Case:
      if (root == null){
         return;
      }

      postOrderTraversal(node.left);
      postOrderTraversal(node.right);
      System.out.printf("%d ", root.value);

   }
   
   
   


   /**
    * Method trys to find the given key in the Binary search tree.
    * @param root Root node of tree.
    * @param key Value to be found in the tree.
    * @return Returns either True if found or False if value is not found.
    */
   public boolean find(Node root, int key){
	  //Base Case:
      if(root.value == key){
         return true;
      }
      else if(key > root.value){
         return find(root.right, key);
      }
      else if(key < root.value){
         return find(root.left, key)
      }
      else{
         return false;
      }
   }
   


   /**
    * Method returns the minimum value in the binary search tree.
    * @param root Root node of the binary search tree.
    * @return Returns the minimum value in the tree.
    */
   public int getMin(Node root){
      //implement me
      if (root.left == null){
         return root.value;
      }
      return getMin(root.left);
   }
  


   /**
    * Method returns the largest value in the binary search tree.
    * @param root Root node of tree.
    * @return Returns the largest value in the tree.
    */
   public int getMax(Node root){
	  //implement me
      if (root.right == null){
         return root.value;
      }
      return getMax(root.right);
   }


   /**
    * Method deletes the given value from the binary search tree.
    * @param root Root node of tree.
    * @param key Value to be removed from tree.
    * @return Returns node.
    */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}