package practiceQuestionsExtra;

import java.util.Scanner;
import java.util.Stack;

public class StackQuestions {

	public static void main(String[] args) throws Exception {

//		DynamicStack ds = new DynamicStack();
//
//		ds.push(10);
//		ds.push(20);
//		ds.push(30);
//		ds.push(40);
//
//		System.out.println("Stack before: ");
//		ds.display();
//
////		System.out.println("Reverse display: ");
//		actualReverse(ds, new DynamicStack());
//
//		System.out.println("Stack after reversing: ");
//		ds.display();
//
//		int[][] cel = { { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
//
//		celebrity(cel);

//		int[] a = { 50, 30, 20, 40, 10, 45, 5, 60, 8, 15 };
//
//		int[] res = nextGreaterElement3(a);
//		for (int val : res) {
//			System.out.print(val + " ");
//		}

		int[] stock = { 30, 35, 40, 38, 35 };
		int[] res = stockSpan(stock);

		for (int i = 0; i < stock.length; i++) {
			System.out.println(stock[i] + " --> " + res[i]);
		}
	}

	public static void displayReverse(DynamicStack s) throws Exception {

		if (s.isEmpty()) {
			return;
		}

		// BP : to print 10 , 20 , 30, 40 when stack is in(top) 40 30 20 10(bottom) .

		// SP : to print 20, 30, 40

		int temp = s.pop();
		displayReverse(s); // SP.
		s.push(temp);
		System.out.println(s.peek());

	}

	public static void actualReverse(DynamicStack s, DynamicStack helper) throws Exception {

		// process 1 -> storing rev of s in helper

		if (s.isEmpty()) {

			Process2(s, helper);
			return;

		}

		int temp = s.pop();
		helper.push(temp);
		actualReverse(s, helper);

	}

	public static void Process2(DynamicStack s, DynamicStack helper) throws Exception {

		if (helper.isEmpty()) {
			return;
		}

		// process 2 -> storing exact of helper in s.

		int temp = helper.pop();
		Process2(s, helper);
		s.push(temp);

	}

	public static void celebrity(int[][] arr) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			stack.push(i);

		}

		while (stack.size() >= 2) {

			int a = stack.pop();
			int b = stack.pop();

			if (arr[a][b] == 1) {
				// A knows B.
				// means A can't be celebrity, B might be celebrity.
				stack.push(b);
			}

			else {
				// A doesn't know B.
				// means B cannot be celebrity, as everyone knows celebrity, A might be
				// celebrity.
				stack.push(a);
			}
		}

		int possibleCeleb = stack.pop();

		// checking again.
		// testing for a negative case.
		for (int i = 0; i < arr.length; i++) {

			if (i == possibleCeleb)
				continue;

			if (arr[possibleCeleb][i] == 1 || arr[i][possibleCeleb] == 0) {
				// means possible celeb knows someone(nbc) OR someone doesn't know a possible
				// celeb.
				System.out.println("No celeb");
				return;
			}
		}

		System.out.println(possibleCeleb + " is celeb.");
	}

	public static void nextGreaterElement(int[] arr) {

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.empty() && arr[i] > s.peek()) {
				int a = s.pop();
				System.out.println(a + " --> " + arr[i]);
			}

			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop() + " --> -1");
		}
	}

	public static int[] nextGreaterElementorder(int[] arr) {

		// putting idx in stack and storing in new arr using idx.

		Stack<Integer> s = new Stack<>();

		int[] nxtGr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!s.empty() && arr[i] > arr[s.peek()]) {
				int idx = s.pop();
				nxtGr[idx] = arr[i];
			}

			s.push(i);
		}

		while (!s.isEmpty()) {
			int idx = s.pop();
			nxtGr[idx] = -1;
		}

		return nxtGr;
	}

	public static void nextGreaterElement2(int[] arr) {

		Stack<Integer> s = new Stack();

		for (int i = arr.length - 1; i >= 0; i--) {

			while (!s.isEmpty() && arr[i] >= s.peek()) {

				s.pop();

			}

			if (s.isEmpty()) {
				System.out.println(arr[i] + " --> -1");
			}

			else {
				System.out.println(arr[i] + " --> " + s.peek());
			}

			s.push(arr[i]);

		}
	}

	public static int[] nextGreaterElement3(int[] arr) {

		Stack<Integer> s = new Stack();

		int[] res = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {

				s.pop();

			}

			if (s.isEmpty()) {
				res[i] = -1;
			}

			else {
				res[i] = arr[s.peek()];
			}

			s.push(i);

		}

		return res;
	}

	public static int[] stockSpan(int[] arr) {

		int[] res = new int[arr.length];

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();
			}

			if (!s.isEmpty()) {
				int span = i - s.peek();
				res[i] = span;
			} else {
				res[i] = i + 1;
			}

			s.push(i);
		}

		return res;

	}
}
