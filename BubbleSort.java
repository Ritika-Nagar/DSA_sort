package Sorting_algo;

public class BubbleSort {
	// Har round me , largest element apni correct position par aate chle jaate hai 
	static void swap(int [] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void sort(int [] arr, int n) {
		boolean swapped= false;
		for(int i=0;i<n-1;i++) {
			// for round 1 to n-1
			for(int j=0; j<n-i;j++) {
				//for processing elements till n-i th index
				if(arr[j]>arr[j+1]) {
					swap(arr, j,j+1);
					swapped=true;
				}}
			if(swapped==false) {//optimised code
				break;
			}}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
