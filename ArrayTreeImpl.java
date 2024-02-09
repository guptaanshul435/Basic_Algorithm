class ArrayTreeImpl implements ArrayTree{
	
	Object[] elements=new Object[10];
	boolean ret;
	
// set element at root
  public boolean root(Object ele){
	 elements[0]=ele;
	 return true; 
  }
  
  // set element at left
  public boolean setLeft(Object ele,int root){
	  int index=(root*2)+1;
	  if(elements[root]==null){
		  System.out.println("you cannot add ele because you dont have root ele");
		  ret=false;
	  }else{
		  elements[index]=ele;
		  ret=true;
	  }
	  return true;
  }
  
  
  // set element at right 
  public boolean setRight(Object ele,int root){
	  int index=(root*2)+2;
	  if(elements[root]==null){
		  System.out.println("you cannot add ele because you dont have root ele");
		  ret=false;
	  }else{
		  elements[index]=ele;
		  ret=true;
	  }
	  return true;
  }
  
   // print tree in array
  public void print(){
	  for(Object ele:elements){
		  if(ele==null){
			  System.out.print("_ ,");
		  }else{
			  System.out.print(ele+",");
		  }
		  
	  }
	  
  }


}

