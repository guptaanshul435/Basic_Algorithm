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
   
   //Is queue empty
   public boolean isQueueEmpty();

}