interface CrudOperation{


// insert 
public Object insert();



// updare
public boolean update(Object prehold, Object newValue);



//read 
public void read(BinaryTreeNode root);


//delete

public void delete(Object ele);

}