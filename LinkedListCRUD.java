// linked list functionality

// CRUD operation on linked List

interface LinkedListCRUD{

     //Insert
     public Object insert(Object ele);
	 
	 //Read
	 public void travers();
	 public void bacTravers();
	 
	 
	 //insAtPosition
	 public boolean insAtPosition(int position,Object ele);
	 
	 // update at postion
	 
	 public boolean updateAtPostition(int position,Object ele);
	 
	 
	 
	 
	 //Delete
	 public boolean delete(Object ele);
	 



}