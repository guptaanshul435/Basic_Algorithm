// stack data structure in java using Linked List
interface Stack{
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

class StackImpl implements Stack{
	//private int cap=10
	private int top=-1,size;
	private Object arr[];
	
	public StackImpl(){
		arr=new Object[10];
	}
	
	public StackImpl(long cap){
		arr=new Object[10];
	}
	
		//push operation
  public Object push(Object ele){
	  if(arr.length>top){
		  top++;
		  arr[top]=ele;
		  size=top;
	  }else{
		  System.out.println("Stack is full:  Stack over flow");
		  return null;
	  }
	  return ele;
  }
  
  
  //pop operation
  public Object pop(){
	  if(top==-1){
		  System.out.println("stack is full");
	  }else{
		  return arr[top--];
	  }
	    return null;
  }
  
  //find top ele in stack
  public Object peek(){
	  if(top==-1){
		  System.out.println("stack is full");
	  }else{
		  return arr[top];
	  }
	    return null;
  }
  
  
  // Empty stack
  public boolean empty(){
	    if(top==-1){
			return true;
		}
	    return false;
  }
  
  // search 
  public Object search(Object ele){
	  if(isString(ele)){
		  if(top!=-1){
			  for(int i=0;i<=top;i++){
				  if(ele.toString().equals(arr[i].toString())){
					  return ele;
				  }
			  }
		  }
		  
	  }else if(isInteger(ele)){
		  if(top!=-1){
			  for(int i=0;i<=top;i++){
				  if(ele==arr[i]){
					  return ele;
				  }
			  }
		  }
		  
	  }else{
		  System.out.println("this object can not be searched by this way");
		  
	  }
	  return null;
  }
  
  private boolean isString(Object ele){

  if(ele.getClass().getSimpleName().equals("String") 
  || ele.getClass().getSimpleName().equals("StringBuilder")  
  || ele.getClass().getSimpleName().equals("StringBuffer")){
	return true;  
  }
  return false;
  }
 private boolean isInteger(Object ele){
	 if(ele.getClass().getSimpleName().equals("Integer") 
  || ele.getClass().getSimpleName().equals("Float")  
  || ele.getClass().getSimpleName().equals("Double")){
	return true;  
  }

  System.out.println(ele.getClass().getSimpleName());
  return true;
  }  
  
  public static void main(String[] agrgs){
	  Stack st=new StackImpl();
	  
	  
	  st.push("Ram ji");
	  st.push("Seeta ji");
	  st.push("hanuman ji");
	  System.out.println(st.push("Ram"));
	 // System.out.println(st.pop());
	  //System.out.println(st.pop());
	  //System.out.println(st.pop());
	  System.out.println(st.peek());
	  
	  System.out.println(st.search("Ram"));
	   System.out.println(st.empty());
	  
	  
	  
  }
	
}
