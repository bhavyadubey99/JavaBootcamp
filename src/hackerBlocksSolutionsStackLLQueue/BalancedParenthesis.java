package hackerBlocksSolutionsStackLLQueue;

import java.util.*;

public class BalancedParenthesis {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StacksUsingArrays stack = new StacksUsingArrays(1000);
		if (isBalanced(str, stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {

		for (int i = 0; i < str.length(); i++) {

			char upcomingElement = str.charAt(i);

			if (upcomingElement != ' ') {

				if (stack.isEmpty()) {
					// stack is empty, or upcoming element is an opening bracket
					stack.push(upcomingElement);
				} else if (upcomingElement == ')' && stack.top() == '(') {
					stack.pop();
				} else if (upcomingElement == '}' && stack.top() == '{') {
					stack.pop();
				} else if (upcomingElement == ']' && stack.top() == '[') {
					stack.pop();
				} else {
					stack.push(upcomingElement);
				}
			}
		}

		if (stack.isEmpty())
			return true;

		return false;

	}

}

class StacksUsingArrays {
	private int[] data;
	private int tos;

	public static final int DEFAULT_CAPACITY = 10;

	public StacksUsingArrays() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public StacksUsingArrays(int capacity) throws Exception {
		if (capacity <= 0) {
			System.out.println("Invalid Capacity");
		}
		this.data = new int[capacity];
		this.tos = -1;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		int retVal = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return retVal;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		int retVal = this.data[this.tos];
		return retVal;
	}

	public void display() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");
		}
		for (int i = this.tos; i >= 0; i--) {
			System.out.println(this.data[i]);
		}

	}

}
