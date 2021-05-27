package practiceQuestionsExtra;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQuestions {

	public static void main(String[] args) throws Exception {

//		DynamicQueue q = new DynamicQueue();
//
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//
//		System.out.println("--");
//		q.display();
//		System.out.println();
//		System.out.println("Reverse:  ");
//		displayReverse(q, 0);
//		System.out.println();
//		System.out.println("--");
//
//		System.out.println("Before : ");
//		q.display();
//		actualReverse(q);
//		System.out.println("\nAfter : ");
//		q.display();

		int[] arr = { 10, -10, -8, 6, -30, 40, 50, 60 };
		firstNegativeIntegerWindow(arr, 3);
	}

	public static void actualReverse(DynamicQueue q) throws Exception {

		// base case
		if (q.isEmpty()) {
			return;
		}

		// Recursion

		int temp = q.dequeue();
		actualReverse(q);
		q.enqueue(temp);

	}

	public static void displayReverse(DynamicQueue q, int count) throws Exception {

		if (count == q.getSize()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q, count + 1);
		System.out.print(temp + " ");

	}

	public static void firstNegativeIntegerWindow(int[] arr, int k) {

		Queue<Integer> q = new LinkedList<>();

		// preparing the first window .
		for (int i = 0; i < k - 1; i++) {
			if (arr[i] < 0)
				q.add(i);
		}

		// first negative int of first window
		System.out.println(arr[q.peek()]);

		// Now, we will update our window.
		for (int i = k; i < arr.length; i++) {

			// checking value out of window. arr[i-k]
			if (q.peek() == i - k) {
				q.remove();
			}

			// adding new value
			if (arr[i] < 0) {
				q.add(i);
			}

			// ans - > first negative integer in this window.
			if (q.isEmpty())
				System.out.println("No negative element.");
			else
				System.out.println(arr[q.peek()]);
		}

	}

}
