package Recursion;

import java.util.Scanner;

public class AllIndicesElementOccurence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt(); 

		int[] res = allIndices2(arr, m, 0, 0);

		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	public static int[] allIndices(int[] arr, int val, int vidx) {

		if (vidx == arr.length) {
			return new int[0];
		}

		// from vidx + 1 to end

		int[] rr = allIndices(arr, val, vidx + 1);

		if (arr[vidx] == val) {

			int[] res = new int[rr.length + 1];

			for (int i = 0; i < rr.length; i++) {
				res[i] = rr[i];
			}

			res[res.length - 1] = vidx;

			return res;
		}

		return rr;

	}

	public static int[] allIndices2(int[] arr, int val, int vidx, int count) {
		
		//bc
		if(vidx == arr.length) {
			return new int[count];
		}

		if (arr[vidx] == val) {
			int[] indices = allIndices2(arr, val, vidx + 1, count + 1);

			indices[count] = vidx;

			return indices;
		} else {
			int[] indices = allIndices2(arr, val, vidx + 1, count);

			return indices;
		}

	}

}
