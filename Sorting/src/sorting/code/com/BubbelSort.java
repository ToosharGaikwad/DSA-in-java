package sorting.code.com;

import java.util.Scanner;

public class BubbelSort {
	
public static void main(String[] args) {
	
	sort();
	
}
	public static void sort(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
//		int []arr = new int[size];
//		int arr[];
//		int[]brr;
//		int crr[]= new int[size];
//	     int crr[] = {2,3,4,5,6};
		
		int []arr = new int[size];
		
//		System.out.println("Enter " + size + "element");
		for(int i=0;i<arr.length;i++)
				{
			System.out.println(i);
			arr[i] = sc.nextInt();
				}
		
		
		System.out.println("before sorting  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		bubbleSort(arr);
		
      System.out.println("after sorting ");
      for(int i=0;i<arr.length;i++) {
    	  
    	  System.out.println(arr[i] +" ");
    	  
      }
	}
		
	
	
	
	



public static void bubbleSort(int [] arr)
{
	for(int i=0;i<arr.length-1;i++) {
	
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}
}
