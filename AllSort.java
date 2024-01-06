class AllSort implements SpacificationOfSort{

// insertion sort  O(n^2)
public void insSort(int[] arr){
	for(int i=0;i<arr.length;i++){    //n   O(n)
		
		int key=arr[i];
		int m=i-1;
		while(m>=0 && arr[m]>key){   //n*allmost n  == O(n^2)
			arr[m+1]=arr[m];
			--m;
		}
	arr[m+1]=key;
	}
}

// Selection Sort
public void selSort(int[] arr){
	int n=arr.length;
	for(int i=0;i<n-1;i++){           // n
		int min=i;
		for(int j=i+1;j<n;j++){        // n*n  == O(n)
			if(arr[j]<arr[min]){
				min=j;
			}
		}
		swap(min,i,arr);
	}
}

// swap
private void swap(int min,int i , int[] arr){
	int temp=arr[min];
	arr[min]=arr[i];
	arr[i]=temp;	
}


//
public void bubbleSort(int[] arr){
	int n=arr.length;
	for(int i=0; i<n;i++){              // n
		for(int j=0;j<n-1;j++){         // n*n   == O(n^2)
			if(arr[j]>arr[j+1])
				swap(j,j+1,arr);
		}	
	}	
}


// Quick sort
public void quickSort(int[] arr,int low,int high)
{
	
	if(low<high){
	
	
	// pi is the partition of the index now the pivot element on it right place
     int pi=partition(arr,low,high);
	 //We are solving until single element
	 quickSort(arr,low,pi-1);
	 quickSort(arr,pi+1,high);
	}
}


// partition
private int partition(int[] arr,int low, int high){
	// choosing the pivot
	int pivot=arr[high];
	// index of smaller element and indicates
	int i=(low-1);
	for(int j=low;j<high;j++){
		if(arr[j]<pivot){
			i++;
			swap(i,j,arr);
		}
	}
	swap(i+1,high,arr);
	return i+1;
}


//MergeSort
public void mergeSort(int[] arr,int l,int r){
	
	if(l<r){
		int m=l+(r-l)/2;
		
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);
		
		//merge the sorted array
		merge(arr,l,m,r);	
	}
}

private void merge(int[] arr, int low,int mid,int high){

// first of all we will take the length for low to mid and mid to high for creating temparary array

// because we are going to have data length of 
int n1=mid-low+1;
int n2=high-mid;

//create two temp array
int L[]=new int[n1];
int R[]=new int[n2];

// copy the data to temp array
for(int i=0;i<n1;i++){
L[i]=arr[low+i];
}
for(int j=0;j<n2;j++){
R[j]=arr[mid+1+j];
}	

//intialilise the indexs of the first and second array

int i=0,j=0;

//intial index of the merge subarray
int k=low;

while(i<n1 && j<n2){
	if(L[i]<=R[j]){
		arr[k]=L[i];
		i++;
	}else{
		arr[k]=R[j];
		j++;
	}
	k++;
}	

//copy remainig elements of L[] if any
while(i<n1){
	arr[k]=L[i];
	i++;
	k++;
}
//copy the remaining elements of R[] if any
while(j<n2){
	arr[k]=R[j];
	j++;
	k++;
}

}
public void print(int[] arr){
	
	for(int i:arr){
		System.out.println(i);
	}
	
}

public static void main(String args[]){
SpacificationOfSort spa=new AllSort();
int arr[]={12,3,4,2,1,6,7,10};
//.selSort(arr);
//spa.print(arr);




System.out.println("********************************");
spa.mergeSort(arr,0,arr.length-1);
spa.print(arr);

}


}