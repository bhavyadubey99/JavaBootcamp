package hackerBlocksSolutions3;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int disc = sc.nextInt(); 
		
		towerOfHanoi(disc, '1' , '2' , '3');
		System.out.println(countOfTowerOfHanoi(disc, '1' , '2' , '3', 0));

		
	}
	
	public static void towerOfHanoi(int n, char src , char dest, char aux) {
		
		//base case : 
		if(n == 1) {
			//only one disc is left. 
			System.out.println("Move " + n + "th disc from T" + src + " to T" + dest);
			return;
		}
		
		//fr -> from rod , tr -> to rod, ar -> auxilliary rod. 
		
		//BP : to move 1st to n (for eg - 4 rods to another rod.(tr)) 
		//SP : to move 1st to (n-1) rods to tr rod. 
		
		towerOfHanoi(n-1, src, aux, dest); 
		
		//left out 4th disc is moved to tr.
		System.out.println("Move " + n + "th disc from T" + src + " to T" + dest);
		
		//moving the left over n-1(3) of disc in auxilliary rod in tr. 
		towerOfHanoi(n-1, aux, dest, src); 
		
	}
	
	public static int  countOfTowerOfHanoi(int n, char src , char dest, char aux , int count) {
		
		//base case : 
		if(n == 1) {
			//only one disc is left. 
			count++; 
			return count;
			
			
		}
		
		//fr -> from rod , tr -> to rod, ar -> auxilliary rod. 
		
		//BP : to move 1st to n (for eg - 4 rods to another rod.(tr)) 
		//SP : to move 1st to (n-1) rods to tr rod. 
		
		int c1 = countOfTowerOfHanoi(n-1, src, aux, dest , count); 
		
		//left out 4th disc is moved to tr.
		//System.out.println("Move " + n + "th disc from T" + src + " to T" + dest);
		c1++; 
		
		//moving the left over n-1(3) of disc in auxilliary rod in tr. 
		int c2 = countOfTowerOfHanoi(n-1, aux, dest, src , c1); 
		
		return c2;
		
	}

}
