package sorting.code.com;

public class QuickSort {

	
	
	public void quicksort(int arr[], int low , int high) {
		 if (low < high) {
			 
				 
				   int pi = divide(arr, low, high);
			        quicksort(arr, low, pi - 1);  
			        quicksort(arr, pi + 1, high);  
			 }
		 }
	
	
	
	
	public int divide(int arr[],int low,int high) {
	int pivot = arr[high];
	int frist = low-1;
	for(int itr = low;itr<high;itr++) {
		
		if (arr[itr] < pivot){
			frist++;
			int temp = arr[frist];
			arr[frist] = arr[itr];
			
			arr[itr] = temp;
		}
		
	}
	
	  int temp = arr[frist+1];
		arr[frist+1]= arr[high];
		arr[high] = temp;
		return frist+1;
	}
	
	public static void main(String[] args) {
		int []arr={2,33,6,55,88,44};
		int low =0;
		int high = arr.length-1;
		 QuickSort obj = new QuickSort();
		 obj.quicksort(arr, low, high);

	        for (int itr : arr) {
	            System.out.print(itr + " ");
	        }
		
	}

}
