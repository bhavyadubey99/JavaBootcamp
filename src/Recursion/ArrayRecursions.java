package Recursion;

public class ArrayRecursions {
	public static void main(String[] args) {

		int[] arr = { 6,4, 3, 1, 1, 3, 4 };

//		System.out.println(isSorted(arr, 0));

		System.out.println(lastOccurence2(arr, 0, 4));

	}

	public static boolean isSorted(int[] arr, int si) {

		if (si == arr.length - 1) {
			// positive base case
			return true;
		}

		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			boolean ans = isSorted(arr, si + 1);
			return ans;
		}
	}

	public static int firstOccurence(int[] arr, int vidx, int val) {

		// here vidx is starting idx

		if (vidx == arr.length) {
			return -1;
		}

		// BP : to find first occurence of array from 0 to n

		// SP : to find first occurence of array from 1 to n
		// extra work : to check whether it exists at 0 idx.

		if (arr[vidx] == val) {
			return vidx;
		} else {
			int vp1idx = firstOccurence(arr, vidx + 1, val);
			return vp1idx;
		}

	}

	public static int lastOccurence(int[] arr, int vidx, int val) {

		// here, vidx is ending idx.

		if(vidx == -1) {
			return - 1; 
		}
		
		// BP : to find the last occurence in array from 0 to n

		// SP : to find last occurence in array from 0 to n - 1

		// extra work : to check whether nth element is val?
		
		if(arr[vidx] == val) {
			return vidx;
		}
		else {
			int lovidxm1 = lastOccurence(arr, vidx - 1, val); //last occurence in 0 to vidx - 1 
			return lovidxm1;
		}

	}
	
	public static int lastOccurence2(int[] arr, int vidx, int val) {
		
		// traversing from start only , means vidx is starting idx 
		
		if(vidx == arr.length) {
			return - 1; 
		}
		
		int idx = lastOccurence2(arr, vidx + 1, val);
		
		if(idx == -1) {
			//means last occurence didnt exist, means check with current idx. (vidx) 
			if(arr[vidx] == val) {
				return vidx;
			}
		}
		
		return idx;
		
	}

}
