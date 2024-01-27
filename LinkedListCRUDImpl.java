

class LinkedListCRUDImpl implements LinkedListCRUD{

     // duble linked list requirements
	 // head,tail,temp on node type
     public Node head=null,tail=null,temp=null,ttemp=null;
	 //head=tail=temp=null;
     //Insert
     public Object insert(Object ele){
		 // first when we are going to creat list we check the head because the only we can know that there is list or not
		 Node newNode=new Node(ele);
		 if(head==null){
			 head=newNode;
			 tail=head;
		 }else{
			 tail.next=newNode;
			 newNode.pre=tail;
			 tail=newNode;
		 }
		 return newNode.ele;
	 }
	 
	 //Read
	 public void travers(){
		 // first resposibilty to check that list is empty or not;
		 if(head==null){
			System.out.println("you dont have elements for traversing"); 
		 }else{
			 temp=head;
			 while(temp.next!=null){
				 System.out.println(temp.ele);
				 temp=temp.next;
			 }
			 System.out.println(temp.ele); 
		 }	 
	 }
	 
	 public void bacTravers(){
		 // first resposibilty to check that list is empty or not;
		 if(head==null){
			System.out.println("you dont have elements for traversing"); 
		 }else{
			 temp=tail;
			 while(temp.pre!=null){
				 System.out.println(temp.ele);
				 temp=temp.pre;
			 }
			 System.out.println(temp.ele); 
		 }	 
	 }
	 
	 
	 //update
	 public boolean insAtPosition(int position,Object ele){
		 int count=0;
		 Node newNode=new Node(ele);
		 if(head==null){
			 System.out.println("Actuly list is empty and you ele position should be 0");
			 if(position==0){
				 head=newNode;
			 }
		 }else{
			 temp=head;
			 while(temp!=null){
				 count++;
				 if(count==position){
					 newNode.next=temp.next;
					 temp.next.pre=newNode;
					 newNode.pre=temp;
					 temp.next=newNode;
					 return true;
				 }
				 temp=temp.next;
			 }
			 if((count+1)==position){
				 temp.next=newNode;
				 return true;
			 }
		 }
		 
		 return false;
		 
	 }
	 
	 public boolean updateAtPostition(int position,Object ele){
		 int count=0;
		 if(head==null){
			System.out.println("this list is empty you can not update this list"); 
		 }else{
			 temp=head;
			 while(temp!=null){
				 count++;
				 if(count==position){
					 temp.ele=ele;
					 return true;
				 }
				 temp=temp.next;
		 }
		 count++;
		 if(count==position){
					 temp.ele=ele;
					 return true;
		 }	 
	 }
	 return false;
	 }
	 
	 //Delete
	 public boolean delete(Object ele){
		 if(head==null){
			 System.out.println("file is empty you can not delete");
		 }else{
			 temp=head;
			 ttemp=tail;
			 while(ttemp!=temp){
                 if(ttemp.ele==ele){
					 ttemp.pre.next=ttemp.next;
					 ttemp.next.pre=ttemp.pre;
					 return true;
				 }
				 if(temp.ele==ele){
					ttemp.pre.next=ttemp.next;
					ttemp.next.pre=ttemp.pre;
                    return true;					
				 }
				 temp=temp.next;
				 ttemp=ttemp.pre;

			 }				 
			tail.pre.next=null;
			tail.pre=null;
		 }
		 
		 return false;
		 
	 }
	 
	 
	 public static void main(String[] args){
		LinkedListCRUDImpl impl=new LinkedListCRUDImpl();
        impl.insert(10);
		impl.insert(20);
		impl.insert(30);
		impl.insert(40);
		impl.insert(50);
		impl.insert(60);
		impl.insert(70);
		
		impl.travers();
		System.out.println("*****************************************************");
		
		impl.insAtPosition(3,100);
		impl.updateAtPostition(2,40);
		
		impl.delete(50);
		
		impl.bacTravers();
		
		
		 
	 }


}