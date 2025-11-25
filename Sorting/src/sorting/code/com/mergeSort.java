package sorting.code.com;

public class mergeSort {

	
	
	
	public static void main(String[] args) {
		int []arr = {5,2,22,6,23,55};
		
		sort(arr,0,arr.length-1);
		for(int ele:arr) {
			System.out.print(ele + " ");
		}
	}

	private static void sort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = left+((right-left)/2);
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left ,mid, right);
			}
		}
	private static void merge(int[]arr, int left,int mid, int right ) {
		int leftSize = mid - left+1;
		int rightSize = right - mid;
		
		int [] leftArray = new int[leftSize];
		int [] rightArray = new int[rightSize];
		
		for(int leftCounter = 0;leftCounter<leftSize;leftCounter++) {
			leftArray[leftCounter] = arr[left+leftCounter];
			
		}
		for(int rightCounter = 0;rightCounter<rightSize;rightCounter++) {
			rightArray[rightCounter] = arr[rightCounter + mid + 1];
		}
		int rightCtr = 0;
		int leftCtr = 0;
		
		int mergeCtr = left;
		
		while(leftCtr < leftSize && rightCtr < rightSize) {
			if(leftArray[leftCtr] <= rightArray[rightCtr]) {
				arr[mergeCtr] = leftArray[leftCtr];
				leftCtr++;
//				
			}else {
				arr[mergeCtr] = rightArray[rightCtr];
				rightCtr++;
//				
			}
			mergeCtr++;
		}
		while(leftCtr<leftSize) {
			arr[mergeCtr] = leftArray[leftCtr];
			leftCtr++;
			mergeCtr++;
		}
		while(rightCtr<rightSize) {
			arr[mergeCtr] =rightArray[rightCtr];
			rightCtr++;
			mergeCtr++;
		}
		
		
	}


}
