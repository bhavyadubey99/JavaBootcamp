package Recursion;

public class RecursiveBubbleSort {
	
	public static void main(String[] args) {
		
		int[] a = {10, 20, 50, 30, 22, 40};
		
		bubbleSort(a, 0, a.length - 1);
		
		for(int v : a) {
			System.out.println(v);
		}
		
		
		
	}
	
	public static void bubbleSort(int[] arr, int si, int ei) {
		
		// BP : to sort arr from 0 to n 
		// or to sort arr from 1 to n 
		
		
		// SP : to sort arr from 1 to n 
		/// or to sort arr from 2 to n
		
		// extra work :  to leave the 0th element
		// or to compare arr[0] and arr[1] - which is bigger? move bigger to the right.
		
		//base case 
		if(ei == 0) {
			return;
		}
		
		
		if(si == ei) {
			bubbleSort(arr, 0, ei - 1);
			return;	
		}
		

		
		//extra work
		if(arr[si] > arr[si + 1]) {
			//swap
			int temp = arr[si]; 
			arr[si] = arr[si + 1]; 
			arr[si + 1] = temp; 
		}
		
		//smaller prob
		bubbleSort(arr, si + 1, ei); 
		
		
		
		
		
		
	}

}
