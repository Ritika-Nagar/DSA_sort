package Sorting_algo;

public class InsertionSort {
	static void sort(int [] arr, int n) {
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;// no of rounds ...becoz we are initially thinking that 1 st element is already sorted 
			for(; j>=0;j--) {
				if(arr[j]>arr[i]) {
					arr[j+1]=arr[j]; // shift
				}else {break;// ruk jao
				
				}
			}
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
