import java.util.*;

class BasicOperationOnArrayImp implements BasicOperationOnArray{
//Serching in array linearly
private boolean reval=false;
public Object lSearch( Object[] arr,Object ele){
	if(isString(ele)){
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(ele)){
				return ele;
			}
		}
		
	}else if(isInteger(ele)){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele){
				return ele;
			}
		}
	}else{
		throw new MyException("This object cannt be compared");
	}
	return null;
	
}

    private boolean isString(Object ele){
	final List<String> list=new ArrayList<String>();
	list.add("String");
	list.add("StringBuffer");
	list.add("StirngBuilder");
	list.forEach(
	(item) ->{
     if(item.equals(ele.getClass().getSimpleName())){
		 reval=true;
	 }
     });
	return reval;
}

   private boolean isInteger(Object ele){
	if("Integer".equals(ele.getClass().getSimpleName())){
		return true;
	}
	return false;
}
	
	
public Object bSearch(Object[] arr,Object ele){
	int low=0,high=arr.length;
	if(isInteger(ele)){
	while(low<high){
		int mid=low+(high-low)/2;
		if(arr[mid]==ele)
			return ele;
		else if((int)ele>(int)arr[mid])
			low=mid+1;
		else if((int)ele<(int)arr[mid])
			high=mid-1;
	}	
	}else{
		if(isString(ele)){
			while(low<high){
				int mid=low+(high-low)/2;
				int comto=ele.toString().compareTo(arr[mid].toString());
				if(comto==0)
					return ele;
				else if(comto>0)
					low=mid+1;
				else
					high=mid-1;
			}	
		}
	}
	return null;
}

public void revArray(Object[] arr){
	int i=0,j=arr.length-1;
	while(i<j){	
	swap(i,j,arr);	
	i++;
	j--;
	}	
}

private void swap(int i,int j,Object[] arr){
	Object temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}



public void Rrotation(Object[] arr){
	int n=arr.length;
	Object first=arr[0];
	for(int i=0;i<n-1;i++)
		arr[i]=arr[i+1];
	arr[n-1]=first;
}

public void Lrotation(Object[] arr){
	int n=arr.length;
    Object last=arr[n-1];
	for(int i=n-1;i>0; i--)
		arr[i]=arr[i-1];
	arr[0]=last;
		
	
}

public boolean insert(Object[] arr, Object ele){
	return true;
	
	
	
}


public boolean delete(Object[] arr,Object ele){
	return true;
	
	
}


public Object searchInSortedArray(Object[] arr){
	return null;
	
}

public Object insertInSortedArray(Object[] arr,Object ele){
return null;	
	
}

public Boolean deleteInSortedArray(Object[] arr,Object ele){
return true;
	
}

public void genSubArray(Object[] arr){
	
	
	
}

public static void main(String[] args){
	BasicOperationOnArrayImp opr=new BasicOperationOnArrayImp();
	String[] arr={ "Bajarang bali", "Hanuman baba", "Ram ji", "Sheeta ji" };
	Object arr1[]={1,2,3,4,5,6,7};
	//Object val=opr.bSearch(arr,"Ram ji");
	//System.out.println(val);
	opr.Lrotation(arr);
    for(Object rev:arr){
		System.out.println(rev);
	}
}


}