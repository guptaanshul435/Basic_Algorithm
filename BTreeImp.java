import java.io.*;
class BTreeImp implements CrudOperation{
	
	BinaryTreeNode root=null,temp=null;
	String ele;
// insert 
public Object insert(){
	try{
	BufferedReader eleReader;
	
	System.out.println("you want to add node at right press r or R or else press l to add to left, if you dot want to add any more press any key accept R,L");
	while(true){
	InputStreamReader isr=new InputStreamReader(System.in);
	eleReader=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader reader=new BufferedReader(isr);
	
	ele=eleReader.readLine();
	String decision=reader.readLine();
	BinaryTreeNode bNode=new BinaryTreeNode(ele);
	System.out.println(decision);
	if(decision.equalsIgnoreCase("r")){
		if(root==null){
			root=bNode;
		}else{
			temp=root;
			while(temp.right!=null){
				temp=temp.right;
			}
			temp.right=bNode;
		}
	}else if(decision.equalsIgnoreCase("l")){
		if(root==null){
			root=bNode;
		}else{
			temp=root;
			while(temp.left!=null){
				temp=temp.left;
			}
			temp.left=bNode;
		}
	}else{
		break;
	}
	}
	
	}catch(IOException e){
		
	}
	return ele;
	
}
	
public BinaryTreeNode getRoot(){
	return root;
}




// updare
public boolean update(Object prehold, Object newValue){
	
	
	return true;
}



//read 
public void read(BinaryTreeNode bRoot){
	temp=bRoot;
	if(temp!=null){
		if(temp.left!=null)
		 read(temp.left);	
		
	  System.out.print(bRoot.ele+",");
	  if(temp.right!=null)
	    read(temp.right);
	}
	
}


//delete

public void delete(Object ele){
	
	
	
}

}