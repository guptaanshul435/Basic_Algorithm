public class MainBTree{

public static void main(String[] args){
	BTreeImp bTreeImp=new BTreeImp();
	
	System.out.println(bTreeImp.insert());
	bTreeImp.read(bTreeImp.getRoot());
	
	
}


}