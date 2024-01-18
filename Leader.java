// find leaders in in array 


import java.util.*;
class Leader{
	// static method
	public static void findleaders(int arr[]){
		//length of the array -1
		int n=arr.length-1;
		// there is pointer, which is pointing to the last element in the array and will be assigne when index of m is less then index of ithen i will be assigned to m
		int m=n;
		// i is itrate from last to starting index and m will be pointing to the greatest element from index m
		for(int i=n;i>=0 ;i--){
			if(arr[m]<=arr[i]){
				System.out.println(arr[i]);
				m=i;
			}
			
		}
		
	}
	

	public static boolean bSearch(int low,int high,int[] arr,int key){
		
		while(low<=high){
			
		int mid=low+(high-low)/2;
		if(arr[mid]==key){
			return true;
		} 
		
		if(arr[mid]<key){
			low=mid+1;
		}
		
		else{
			high=mid-1;
		}
		
		}
		return false;
	
	}
	public static boolean findSum(int[] arr,int sum){
		Arrays.sort(arr);
		int n=arr.length-1;
		
		for(int i=n;i>=0;i--){
			int key=sum-arr[i];
			if(bSearch(0,i-1,arr,key)){
				System.out.println("yes");
				return true;
			}
		}
		return false;
		
	}

public static void main(String[] args){
	int[] arr={600,13,14,555,450,133,433,6};
	//find leaders in the array
	Leader.findleaders(arr);
	
	
	// find sum of two element is in the array 19 is the sum here
	if(Leader.findSum(arr,19)){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}