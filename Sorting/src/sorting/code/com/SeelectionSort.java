package sorting.code.com;

public class SeelectionSort {

	
	
	public static void main(String[] args) {
		int []arr = {2,5,32,53,62,1,9};
		
		
	
		for(int i=0;i<arr.length-1;i++) {
			int minindex=i;
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[j]<arr[minindex]) 
			{
				minindex = j;
				
			}
			
		}
		int temp = arr[minindex];
		arr[minindex]= arr[i];
		arr[i] = temp;
		
		
		}
		for(int n : arr) {
			System.out.println(n + " ");
			
		}

	}
	

}
