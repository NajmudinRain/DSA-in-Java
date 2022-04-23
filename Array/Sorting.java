package Array;

public class Sorting {
	public static void main(String[]args) {
		
		int[] arr= {7,8,3,1,2};
//		BubbleSort(arr);
//		SelectionSort(arr);
//		InsertionSort(arr);
//		for(int k=0;k<arr.length;k++) {
//			System.out.print(arr[k]+" ");
//		}
		divide(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
//		System.out.println("naj");
		
	}
//	static int[] BubbleSort(int[]arr) {
//		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//			
//		}
//		return arr;
//		
//		
//	}
//	will suppose 1 element as smallest and compare it with all the elements in one iteration. then the smallest will be placed first.
//	static int[] SelectionSort(int []arr) {
//		for( int i=0;i<arr.length-1;i++) {
//			int smallest=i;
//			for( int j=i+1;j<arr.length;j++) {
//				if(arr[smallest]>arr[j]) {
//					smallest=j;
//				}
//			}
//			int temp=arr[smallest];
//			arr[smallest]=arr[i];
//			arr[i]=temp;
//		}
//		
//		
//		return arr;
//	}
static int[] InsertionSort(int []arr) {
		
		for( int i=1;i<arr.length;i++){
		    int current=arr[i];
		    int j=i-1;
		    while( j>=0&&current<arr[j]){
		        
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=current;
		    
		}
		return arr;
	}

static void divide(int arr[], int si,int ei) {
	if(si>=ei) {
		return;
	}
	int mid=si+(ei-si)/2;
	divide(arr,si,mid);
	divide(arr,mid+1,ei);
	conquer(arr,si,mid,ei);
}
static void conquer(int arr[],int si,int mid, int ei) {
	int merged[]=new int[ei-si+1];
	int idx1=si;
	int idx2=mid+1;
	int x=0;
	while(idx1<=mid&&idx2<=ei) {
		if(arr[idx1]<=arr[idx2]) {
			merged[x++]=arr[idx1++];
		}else {
			merged[x++]=arr[idx2++];
		}
	}
	while(idx1<=mid) {
		merged[x++]=arr[idx1++];
	}
	while(idx2<=ei) {
		merged[x++]=arr[idx2++];
	}
	for(int i=0,j=si;i<merged.length;i++,j++) {
		arr[j]=merged[i];
	}
}

}
