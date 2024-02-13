//BinarySearchCheck
class BinarySearchCheck{


  public BinaryTreeNode newNode(Object ele){
	  BinaryTreeNode node=new BinaryTreeNode(ele);
	  return node;
  }
  
  private int maxValue(BinaryTreeNode node)
  {
    if (node == null) {
      return Integer.MIN_VALUE;
    }
    int value = (int)node.ele;
    int leftMax = maxValue(node.left);
    int rightMax = maxValue(node.right);
 
    return Math.max(value, Math.max(leftMax, rightMax));
  }

   private int minValue(BinaryTreeNode node)
  {
    if (node == null) {
      return Integer.MAX_VALUE;
    }
    int value = (int)node.ele;
    int leftMax = minValue(node.left);
    int rightMax = minValue(node.right);
 
    return Math.min(value, Math.min(leftMax, rightMax));
  }

// this is the check for binary search tree
  public int isBST(BinaryTreeNode node)
  {
    if (node == null) {
      return 1;
    }
     
    /* false if the max of the left is > than us */
    if (node.left != null
        && maxValue(node.left) > (int)node.ele) {
      return 0;
    }
     
    /* false if the min of the right is <= than us */
    if (node.right != null
        && minValue(node.right) < (int)node.ele) {
      return 0;
    }
     
    /* false if, recursively, the left or right is not a
         * BST*/
    if (isBST(node.left) != 1
        || isBST(node.right) != 1) {
      return 0;
    }
     
    /* passing all that, it's a BST */
    return 1;
  }
  
  public static void main(String[] args){
	  
	  BinarySearchCheck bsc=new BinarySearchCheck();
	  
	  BinaryTreeNode root=bsc.newNode(10);
	  root.left=bsc.newNode(5);
	  root.right=bsc.newNode(11);
	  root.left.left=bsc.newNode(3);
	  root.left.right=bsc.newNode(9);
	  if(bsc.isBST(root)==1){
		  System.out.println("the given tree is bst");
	  }else{
		  System.out.println("the given tree is not bst");
	  }
  }
  
}