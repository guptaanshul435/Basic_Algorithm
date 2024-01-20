// find the number odd occurence in array.1, 2, 3, 2, 3, 1, 3
class OddOccurence{

public int oddOccur(int[] arr){
	
	int n=arr.length;
	int res=0;
	for(int i=0;i<n;i++){
		res^=arr[i];
	}
	return res;
	
}

public static void main(String[] args){
	
	OddOccurence oo=new OddOccurence();
	int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
	
	int val=oo.oddOccur(arr);
	System.out.println(val);
	
}


}

