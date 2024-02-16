// implements binary search tree 

class BinarySearchTree{



 public void insert(BinaryTreeNode node, BinaryTreeNode newNode){
	 if((int)node.ele>(int)newNode.ele){
		 if(node.left!=null){
			 insert(node.left,newNode);
		 }else{
			 node.left=newNode;
		 }
	 }else{
		 if(node.right!=null){
			 insert(node.right,newNode);
		 }else{
			 node.right=newNode;
		 }
	 } 
 }
 
 
 //delete
 public boolean delete(BinaryTreeNode root, int ele){
	 if(root==null){
		 return false;
	 }
	 BinaryTreeNode node=searchNode(root,ele);
	 deleteEle(node);
	 return true;
	 
 }
 
 private void deleteEle(BinaryTreeNode found){
	 
	 if(found.right!=null){
		 found.ele=found.right.ele;
		 deleteEle(found.right);
	 }else{
		 found.ele=-1;
		 found=null;
		 
	 }
	 
 }
 
 
 // preOrder
 public void preOrder(BinaryTreeNode node){
	 if(node!=null){ 
	 System.out.println(node.ele);
	 preOrder(node.left);
	 preOrder(node.right);
	 } 
 }
 
 //postOrder
 public void postOrder(BinaryTreeNode node){
	 if(node!=null){
		 postOrder(node.left);
		 postOrder(node.right);
		 System.out.println(node.ele);
	 } 
 }
 
 //inOrder
 public void inOrder(BinaryTreeNode node){
	 if(node!=null){
		 inOrder(node.left);
		 System.out.println(node.ele);
		 inOrder(node.right);
	 }
 }
 
 //Binary Search note
 private BinaryTreeNode searchNode(BinaryTreeNode root,int ele){
	 
	 if((int)root.ele==ele){
		 return root;
	 }else if((int)root.ele>=ele && root.left!=null){
		return searchNode(root.left,ele);
	 }else if((int)root.ele<ele && root.right!=null){
		 return searchNode(root.right,ele);
	 }else{
		 return null;
	 }
		 
	 
 }
 
 
 
 
 //Binary Search ele 
 public int search(BinaryTreeNode root,int ele){
	 
	 if((int)root.ele==ele){
		 return ele;
	 }else if((int)root.ele>=ele && root.left!=null){
		return search(root.left,ele);
	 }else if((int)root.ele<ele && root.right!=null){
		 return search(root.right,ele);
	 }else{
		 return -1;
	 }
		 
	 
 }


public static void main(String[] args){
	
	BinaryTreeNode node=new BinaryTreeNode(5);
	BinaryTreeNode[] binaryTree=new BinaryTreeNode[8];
	binaryTree[0]=new BinaryTreeNode(3);
	binaryTree[1]=new BinaryTreeNode(1);
	binaryTree[2]=new BinaryTreeNode(2);
	binaryTree[3]=new BinaryTreeNode(4);
	binaryTree[4]=new BinaryTreeNode(6);
	binaryTree[5]=new BinaryTreeNode(4);
	binaryTree[6]=new BinaryTreeNode(2);
	binaryTree[7]=new BinaryTreeNode(10);
	
	
	
	BinarySearchTree bst=new BinarySearchTree();
	for(BinaryTreeNode b:binaryTree){
	bst.insert(node,b);
	}
	
	//search
	int found=bst.search(node,5);
	System.out.println("if found ele is -1 means your ele is not found in the tree");
	System.out.printf("The elemet got found:%d\n",found);
	
	//System.out.println(node);
	bst.preOrder(node);
	
	System.out.println(bst.delete(node,5));
	
	System.out.println("*************************************");
	bst.inOrder(node);
	
	System.out.println("*************************************");
	bst.postOrder(node);
	
	
}

}