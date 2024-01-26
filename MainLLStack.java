// Stack using Lined List
class StackNode{
   
   Object ele;
   StackNode next;
   
   public StackNode(Object ele){
	   this.ele=ele;
   }
}

class StackLLImp implements Stack{
  //push operation
  StackNode top=null;
  public Object push(Object ele){
	  StackNode newst=new StackNode(ele);	  
	  if(top==null){
		  top=newst;
		  return ele;
	  }else{
		  newst.next=top;
		  top=newst;
		  return ele;
	  }
  }
  
  
  //pop operation
  public Object pop()
  {
	  if(top==null){
		  System.out.println("you can not pop the element fom the stack");
	  }else{
		 Object val=top.ele;
         top=top.next;	
         return val;		 
	  }
	  return null;
  }
  
  //find top ele in stack
  public Object peek(){
	  if(top==null){
		  System.out.println("There is no element on the peek");
		  return null;
	  }else{
		  return top.ele;
	  }
  }
  
  
  // Empty stack
  public boolean empty(){
	  if(top==null){
		return true;  
	  }else{
		  return false;
	  }
	  
  }
  
  // search 
  public Object search(Object ele){
	  if(top==null){
		  System.out.println("you ele not found");
	  }else if(isString(ele)){
		 while(top!=null){
           if(top.ele.equals(ele+"")){
			   return ele;
		   }
		   top=top.next;
		 }			 
	  }else if(isInteger(ele)){
		  while(top!=null){
			  if(top.ele==ele){
				  return ele;
			  }
			  top=top.next;
		  }
	  }else{
		  System.out.println("As of now this can not be caparable");
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
}

 
  
public class MainLLStack{
	
	public static void main(String[] args){
		Stack st=new StackLLImp();
		System.out.println(st.push("Ram"));
		System.out.println(st.push("Ram"));
		System.out.println(st.push(5));
		System.out.println(st.push("Ram"));
		System.out.println(st.push("Ram"));
		System.out.println(st.peek());
		
		System.out.println(st.search(5));
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		
		
	}
	
}
