package hackerBlocksSolutionsStackLLQueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCards {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		int q = sc.nextInt();

		Stack<Integer> A0 = new Stack<>();

		ArrayList<Stack> A = new ArrayList<Stack>();
		ArrayList<Stack> B = new ArrayList<Stack>();

		for (int i = 0; i < n; i++) {
			A0.push(sc.nextInt());
		}

		A.add(A0);

		// iterations
		for (int i = 1; i <= q; i++) {

			// creating a stack for A, B in every iteration
			Stack<Integer> Bi = new Stack<>();
			Stack<Integer> Ai = new Stack<>();

			// A.get(i - 1) --> would give (i-1)th stack
			Stack<Integer> currStack = A.get(i - 1);

			// from top, picking cards one by one.
			while (!currStack.isEmpty()) {

				int cardNumber = currStack.pop();

				if (cardNumber % nthPrimeNumber(i) == 0) {
					// stack card on pile Bi
					Bi.push(cardNumber);

				} else {
					// stack card on Ai
					Ai.push(cardNumber);
				}
			}

			// curr stack is empty now.
			// Ai is stack that has cards
			// Bi is stack that has cards.

			A.add(Ai);
			B.add(Bi);
		}

		for (int i = 0; i < q; i++) {
			Stack<Integer> temp = B.get(i);

			while (!temp.isEmpty()) {
				System.out.println(temp.pop());
			}
		}
		
		Stack<Integer> temp = A.get(q);
		while(!temp.isEmpty()) {
			System.out.println(temp.pop());
		}

	}

	public static int nthPrimeNumber(int n) {

		int count = 0;

		int i = 1;

		while (count != n) {

			i++;
			if (checkPrime(i)) {
				count++;
			}

		}

		return i;

	}

	public static boolean checkPrime(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
