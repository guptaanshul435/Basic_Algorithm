interface Queue{
	
// add element in the queue
   public boolean add(Object e);

// get element from the queue
   public Object element();

// offer the element from the queue
   public boolean offer(Object e);

// to get the peak element in the queue
   public Object peek();


// poll the element in the queue
   public Object poll();

// remove the element from the the queue
   public Object remove();
   
   // Is Queue full
   public boolean isQueueFull();

}

class QueueImpl implements Queue{
	int rear=-1,front=-1,size,cap=10;
	
	public Object[] queue;
	
	public QueueImpl(){
		queue=new Object[cap];
	}
	
	public QueueImpl(int cap){
		queue=new Object[cap];
		
	}
	
	// add element in the queue
   public boolean add(Object ele){
	   if(isQueueFull()){
		   System.out.println("Circular queue is full");
		   return false;
	   }else{
		   if(front==-1)
			   front=rear=0;
		   else
			   rear=(rear+1)%cap;
		   queue[rear]=ele;
		   return true;
	   } 
   }

// get element from the queue
   public Object element(){
	   if(front==-1){
		   System.out.println("your queue is empty so you can not have element from the queue");
	   }else{
		   return queue[front];
	   }
	   return null;
   }

// offer the element from the queue
   public boolean offer(Object ele){
	    if(isQueueFull()){
		   System.out.println("Circular queue is full");
		   return false;
	   }else{
		   if(front==-1)
			   front=rear=0;
		   else
			   rear=(rear+1)%cap;
		   queue[rear]=ele;
		   return true;
	   } 
   }

// to get the peak element in the queue
   public Object peek(){
	   if(front==-1){
		   System.out.println("your queue is empty so you can not have element from the queue");
	   }else{
		   return queue[front];
	   }
	   return null;
   }


// poll the element in the queue
   public Object poll(){
	   if(front==-1){
		   System.out.println("Queue is empty");
		   return null;
	   }else{
		   return queue[front++];
	   }
	   
   }

// remove the element from the the queue
   public Object remove(){
	   return null;
   }
   
   
   public boolean isQueueFull(){
	   if(front==(rear+1)%cap){
		   return true;
	   }
	   return false;
   }
}

public class MainQueue{
	
	
	public static void main(String[] args){
		Queue queue=new QueueImpl();
		
		System.out.println(queue.add("Mohan"));
		System.out.println(queue.add("Kabir"));
		//System.out.println(queue.add("ram ji"));
		//System.out.println(queue.add("ram prabhu"));
		//System.out.println(queue.add("ram ram ji"));
		//System.out.println(queue.add("ram"));
		//System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		//System.out.println(queue.element());
		
	}
	
	
}