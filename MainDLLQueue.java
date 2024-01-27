class QueueDLLImpl implements Queue{
	
	// add element in the queue
	
	public Node front=null,rear=null; 
   public boolean add(Object ele){
	   Node newNode=new Node(ele);
	   if(front==null){
		   front=newNode;
		   rear=front;
	   }else{
		   rear.next=newNode;
		   rear=newNode;
	   }
	   return true;
   }

// get element from the queue
   public Object element(){
	   if(front==null){
		   System.out.println("you can not take element because Queue is empty");
	   }else{
		   return front.ele;
	   }   
	   return null;
   }

// offer the element from the queue
   public boolean offer(Object ele){
	   Node newNode=new Node(ele);
	   if(front==null){
		   front=newNode;
		   rear=front;
	   }else{
		   rear.next=newNode;
		   rear=newNode;
	   }
	   return true;
	  
   }

// to get the peak element in the queue
   public Object peek(){
	  if(front==null){
		   System.out.println("you can not take element because Queue is empty");
	   }else{
		   return front.ele;
	   }   
	   return null;
   }


// poll the element in the queue
   public Object poll(){
	   if(front==null){
		   System.out.println("you can not take element because Queue is empty");
	   }else{
		    Object ele=front.ele;
			front=front.next;
			return ele;
	   }   
	   return null;
   }

// remove the element from the the queue
   public Object remove(){
	    if(front==null){
		   System.out.println("you can not take element because Queue is empty");
	   }else{
		    Object ele=front.ele;
			front=front.next;
			return ele;
	   }   
	   return null;
   }
   
   // Is Queue full
   public boolean isQueueFull(){
	   return false;
   }
   
   //Is queue empty
   public boolean isQueueEmpty(){
	   return true;
	   
   }
}

public class MainDLLQueue{
	
	public static void main(String[] args){
		Queue queue=new QueueDLLImpl();
	    System.out.println(queue.add("Mohan"));
		System.out.println(queue.add("Ram"));
		System.out.println(queue.add("Ram ji"));
		System.out.println(queue.add("Ram prabhu"));
		System.out.println(queue.add("Ram ram ji"));
		System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}
	
	
}