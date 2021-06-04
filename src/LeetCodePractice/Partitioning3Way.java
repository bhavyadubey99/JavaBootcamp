package LeetCodePractice;

public class Partitioning3Way {
	
	public static void main(String[] args) {
		
		int[] a = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32} ;
		
		partioning(a, 14, 20);
		
	}
	
	public static void partioning(int[] arr, int ll, int hl) {
		
		//ll - lower limit , hl - higher limit. 
		// 0 -> lo - 1 : less than ll 
		// lo -> mid -1 : yet to be dealt with. 
		// mid -> hi : greater than higher limit. 
		
		
		
		int hi = arr.length - 1; 
		int lo = 0; 
		int mid = 0; 
		
		while(mid <= hi){
			
			if(arr[mid] < ll) {
				//swap with lo
				int temp = arr[lo]; 
				arr[lo] = arr[mid]; 
				arr[mid] = temp; 
				
				lo++; 
				mid++; 
			}
			
			else if(arr[mid] >= ll && arr[mid] <= hl) {
				mid++;
				
			}
			else if(arr[mid] > hl) {
				//swap with high
				int temp = arr[hi]; 
				arr[hi] = arr[mid]; 
				arr[mid] = temp; 
				
				hi--;
			}
		}
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
		
	}

}
