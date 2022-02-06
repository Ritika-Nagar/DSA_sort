package Sorting_algo;

public class SelctionSort {
	static void swap(int [] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void sort(int [] arr, int n) {
		// Sabse pehle chote elem ko uski correct position par rkh do 
		
		for(int i=0;i<n-1;i++) {
			int minIndx=i;// sabse pehle , 1st index ko hi apna min elemnt maan liya 
			for(int j=i+1; j<n;j++) {
				if(arr[j]<arr[minIndx]) {
					minIndx=j;
				}
				swap(arr,minIndx,i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {16,3,7,1,19,2};
		
		sort(arr,6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",  ");
		}
	}

}
