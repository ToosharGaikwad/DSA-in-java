package sorting.code.com;

public class InsertionSort {

	public static void main(String[] args) {
		int []arr = {33,2,55,32,7,94,22};
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
//			int index =i;
//			for(int j=i-1;j>=0;j--) {
//				if(arr[j]>temp) {
//					arr[j+1] = arr[j];
//				}
//			}
			
			//with while loop
			int j=i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			
			
			
			arr[j] = temp;
		}
		
		for(int ele:arr){
			System.out.println(ele);
		}
	}

}
