public class MainBTree{

public static void main(String[] args){
	BTreeImp bTreeImp=new BTreeImp();
	BinaryTreeNode root=new BinaryTreeNode("Ram");
	String[] arr={"Ram","Mohan","Kabir","samir"};
	for(String str:arr){
		BinaryTreeNode newNode=new BinaryTreeNode(str);
	System.out.println(bTreeImp.insert(root,newNode));
	}
	
	
	bTreeImp.read(root);
	
	
}


}