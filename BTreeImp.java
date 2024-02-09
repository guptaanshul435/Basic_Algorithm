import java.io.*;
class BTreeImp implements CrudOperation{
	
	BinaryTreeNode root=null,temp=null;
	String ele;
// insert 
public Object insert(BinaryTreeNode root, BinaryTreeNode newNode){
	try{
	BufferedReader eleReader;
	System.out.println("you want to add node at right press r or R or else press l to add to left, if you dot want to add any more press any key accept R,L");
	InputStreamReader isr=new InputStreamReader(System.in);
	//eleReader=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader reader=new BufferedReader(isr);
	
	//ele=eleReader.readLine();
	String decision=reader.readLine();
	//BinaryTreeNode bNode=new BinaryTreeNode(ele);
	System.out.println(decision);
	if(decision.equalsIgnoreCase("r")){
		if(root.right==null){
			root.right=newNode;
		}else{
			insert(root.right,newNode);
		}
	}else if(decision.equalsIgnoreCase("l")){
		if(root.left==null){
			root.left=newNode;
		}else{
			insert(root.left,newNode);
		}
	}
	
	}catch(IOException e){
		
	}
	return ele;
	
}
	
public BinaryTreeNode getRoot(){
	return root;
}




//postOrder

public void postOrder(BinaryTreeNode bRoot){
	temp=bRoot;
	if(temp!=null){
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.println(temp.ele);
	}
	
}



//read 
public void inOrder(BinaryTreeNode bRoot){
	temp=bRoot;
	if(temp!=null){
		if(temp.left!=null)
	      inOrder(temp.left);	
	  System.out.print(bRoot.ele+",");
	    if(temp.right!=null)
	      inOrder(temp.right);
	}
	
}


// preOrder
public void preOrder(BinaryTreeNode bRoot){
	temp=bRoot;
	if(temp!=null){
		System.out.println(temp.ele);
		preOrder(temp.left);
		preOrder(temp.right);
	}
}
}