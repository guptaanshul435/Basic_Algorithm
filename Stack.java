public interface Stack{
	//push operation
  public Object push(Object ele);
  
  
  //pop operation
  public Object pop();
  
  //find top ele in stack
  public Object peek();
  
  
  // Empty stack
  public boolean empty();
  
  // search 
  public Object search(Object ele);
}