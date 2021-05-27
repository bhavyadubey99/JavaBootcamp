package practiceQuestionsExtra;

public class RecursionPractice {

	public static void main(String[] args) {

//		lexicoPrint(0, 10);
//		jumpingNumbers(0, 25);
		palindromicPartitions("poopoo", "");

	}

	public static void PI(int n) {

		// Base Case : 0
		if (n == 0)
			return;
		// BP : 1 --> n print

		// SP : 1 --> (n-1)
		PI(n - 1);

		// work..
		System.out.println(n);
	}

	public static void PD(int n) {

		// Base Case
		if (n == 0)
			return;

		// work
		System.out.println(n);

		// BP : n -> 1

		// SP : (n-1) -> 1
		PD(n - 1);
	}

	// decrease then increase.
	// BP : n -> 1, 1 -> n
	public static void PDI(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// work
		System.out.println(n);

		// SP : (n-1) -> 1 , 1 -> (n-1) ,
		PDI(n - 1);

		// work
		System.out.println(n);

	}

	// increase then decrease
	// BP : start -> n , n -> start
	public static void PID(int start, int n) {

		// Base Case : changing value is start, so base case would be on that variable
		if (start > n)
			return;

		// work
		System.out.println(start);

		// SP : (start + 1) -> n, n -> (start + 1)
		PID(start + 1, n);

		// work
		System.out.println(start);
	}

	// BP : n !
	public static int factorial(int n) {

		// Base Case : 1
		if (n == 1) {
			return 1;
		}

		// SP : (n - 1)!
		int fnm1 = factorial(n - 1); // fnm1 -> factorial n - 1

		// work

		int fn = n * fnm1; // factorial n = n * factorial(n-1)

		// return

		return fn;

	}

	// BP : base ^ exponent

	public static int power(int base, int exponent) {

		// Base Case : exp..
		if (exponent == 0)
			return 1;

		// SP : base ^ (exponent - 1)
		int pnm1 = power(base, (exponent - 1)); // power n - 1

		int pow = pnm1 * base; // power n - 1 * base. (eg : 2 ^ 2 * 2 = 2 ^ 3)

		return pow;

	}

	// fibonacci --> to get nth fibonacci number.
	// BP : nth fibonacci number
	public static int fibonacci(int n) {

		// Base cases ->
		if (n == 0)
			return 0;

		if (n == 1 || n == 2)
			return 1;

		// SP: (n-1)th fibonacci number ---> to get it : -
		// (n-2)fibno + (n-3)fibno

		int fnm1 = fibonacci(n - 2) + fibonacci(n - 3);

		int fn = fnm1 + fibonacci(n - 2);

		return fn;

	}

	// BP : print all elements of array.
	public static void printArray(int[] arr, int idx) {

		// Base Case : idx has reached 0 .

		if (idx < 0)
			return;

		// SP : print arr elements till len - 2 idx.
		printArray(arr, idx - 1);

		// Work?
		System.out.println(arr[idx]);

	}

	public static void reversePrintArray(int[] arr, int idx) {

		// Base Case : idx == arr len

		if (idx == arr.length) {
			return;
		}
		// BP : 0 ---> 4 in decreasing order

		// SP: 1 ---> 4 in decreasing order

		reversePrintArray(arr, idx + 1);

		System.out.println(arr[idx]);
	}

	public static int arrayMax(int[] arr, int vidx) {

		// Base case :

		if (vidx == arr.length)
			return Integer.MIN_VALUE;

		// vidx --> Virtual Index
		// this time vidx = 0

		// BP : find max of array from 0 -> 4

		// SP : find max of array from 1 -> 4

		int max = arrayMax(arr, vidx + 1);

		if (arr[vidx] > max) {
			max = arr[vidx];
		}

		return max;
	}

	public static int firstOccurance(int[] arr, int vidx, int item) {

		// base case : reached end.
		if (vidx == arr.length) {
			return -1;
		}

		// work? --> to check whether vidx stores item. so first check this.. if it
		// doesn't then go and check for SP.
		if (arr[vidx] == item) {
			return vidx;
		}

		// BP : 0 --> 4 - first occurance

		// SP : 1 --> 4 - first occurance

		// index of first occurence.

		return firstOccurance(arr, vidx + 1, item);
	}

	public static int lastOccur(int[] arr, int vidx, int item) {

		// base case:
		if (vidx == arr.length) {
			return -1;
		}

		// BP 0 --> 4
		// SP 1 --> 4

		int ilo = lastOccur(arr, vidx + 1, item);

		if (arr[vidx] == item && ilo == -1) {
			return vidx;
		}

		return ilo;
	}

	public static int[] allOccurIndexes(int[] arr, int vidx, int item, int count) {

		// BP : to get the count , get index.

		if (vidx == arr.length) {
			int[] br = new int[count];
			return br;
		}

		int[] rres;

		if (arr[vidx] == item) {
			rres = allOccurIndexes(arr, vidx + 1, item, count + 1);
			rres[count] = vidx;
		} else {
			rres = allOccurIndexes(arr, vidx + 1, item, count);
		}

		return rres;

	}

	public static void subsequences(String ques, String ans) {

		// Base case
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		// ques becomes rest of chars except first letter in next ques
		// Rest of the Question

		String roq = ques.substring(1);

		char ch = ques.charAt(0); // char that has been removed.

		subsequences(roq, ans); // char ch is not included.
		subsequences(roq, ans + ch); // char ch is included.
	}

	public static int countOfsubsequences(String ques, String ans, int count) {

		// Base case
		if (ques.length() == 0) {
			count++;
			return count;
		}

		// ques becomes rest of chars except first letter in next ques
		// Rest of the Question

		String roq = ques.substring(1);

		char ch = ques.charAt(0); // char that has been removed.

		int c1 = countOfsubsequences(roq, ans, count); // char ch is not included.
		int c2 = countOfsubsequences(roq, ans + ch, c1); // char ch is included.

		return c2;
	}

	public static void subsequenceWithASCII(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		// finding rest of question.
		// and char that is removed.

		String roq = ques.substring(1);
		char ch = ques.charAt(0);
		int av = ch; // ascii value of ch.

		// now char ch has 3 options : include, dont include, be ascii value.

		subsequenceWithASCII(roq, ans); // dont include
		subsequenceWithASCII(roq, ans + ch); // include
		subsequenceWithASCII(roq, ans + "" + av); // ascii value
	}

	public static int countOfASCIISubsequence(String ques, String ans, int count) {

		if (ques.length() == 0) {
			count++;
			return count;
		}

		// finding rest of question.
		// and char that is removed.

		String roq = ques.substring(1);
		char ch = ques.charAt(0);
		int av = ch; // ascii value of ch.

		// now char ch has 3 options : include, dont include, be ascii value.

		int c1 = countOfASCIISubsequence(roq, ans, count); // dont include
		int c2 = countOfASCIISubsequence(roq, ans + ch, c1); // include
		int c3 = countOfASCIISubsequence(roq, ans + "" + av, c2); // ascii value

		return c3;
	}

	public static void validParenthesis(int n, int open, int close, String ans) {

		// negative base case
		if (open > n || open < close) {
			// invalid answer
			return;
		}

		// positive base case
		if (open == close && open == n) {
			// valid answer
			System.out.print(ans + " ");
			return;
		}

		validParenthesis(n, open + 1, close, ans + "("); // open wala bracket add krdiya.
		validParenthesis(n, open, close + 1, ans + ")"); // closing wala bracket add krdiya.
	}

	public static void climbStairs(int curr, int n, String ans) {

		// base cases
		if (curr > n) {
			// -ve base case
			return;
		}
		if (curr == n) {
			// +ve base case
			System.out.print(ans + " ");
			return;
		}
		// 3 options.
		climbStairs(curr + 1, n, ans + '1');
		climbStairs(curr + 2, n, ans + '2');
		climbStairs(curr + 3, n, ans + '3');

	}

	public static void mazePath(int r, int c, int cr, int cc, String ans) {

		// base cases
		if (cr > r || cc > c) {
			// -ve base case
			return;
		}
		if (cr == r && cc == r) {
			System.out.print(ans + " ");
			return;
		}

		mazePath(r, c, cr + 1, cc, ans + 'H');
		mazePath(r, c, cr, cc + 1, ans + 'V');

	}

	public static void permutation(String ques, String ans) {

		// base cases
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			permutation(roq, ans + ch);
		}

	}

	public static void coinTossNoConsecutiveHead(int n, String ans, boolean flag) {

		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}

		if (flag) {
			coinTossNoConsecutiveHead(n - 1, ans + 'T', false);
		} else {
			coinTossNoConsecutiveHead(n - 1, ans + 'H', true);
			coinTossNoConsecutiveHead(n - 1, ans + 'T', false);
		}

	}

	public static void lexicoPrint(int curr, int n) {

		System.out.println(curr);

		if (curr == 0) {
			for (int i = 1; i <= 9; i++) {
				if ((curr * 10 + i) > n)
					return;
				lexicoPrint(curr * 10 + i, n);
			}
		} else {
			for (int i = 0; i <= 9; i++) {
				if ((curr * 10 + i) > n)
					return;
				lexicoPrint(curr * 10 + i, n);
			}
		}
	}

	public static void jumpingNumbers(int curr, int n) {

		if (curr > n)
			return;

		System.out.println(curr);

		if (curr == 0) {

			for (int i = 1; i <= 9; i++) {
				jumpingNumbers(i, n);
			}

		} else {

			int rem = curr % 10;
			if (rem != 0)
				jumpingNumbers(curr * 10 + (rem - 1), n); // a no. before.

			if (rem != 9)
				jumpingNumbers(curr * 10 + (rem + 1), n); // a no. after.

		}

	}

	public static boolean isPalindrome(String s) {

		int l = 0;
		int r = s.length() - 1;

		while (l <= r) {
			if (s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;
		}

		return true;
	}

	public static void palindromicPartitions(String ques, String ans) {

		// base case
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String roa = ques.substring(0, i);
			String roq = ques.substring(i);

			if (isPalindrome(roa)) {
				palindromicPartitions(roq, ans + roa + " ");
			}
		}
	}

}
