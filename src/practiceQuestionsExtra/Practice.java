package practiceQuestionsExtra;

public class Practice {

	public static void main(String[] args) {
		int[] arr = { 10, -12, -5, 3, 11 };
		System.out.println(circularArrayMaxSubarraySum(arr));
	}

	public static void printPrime(int n) {
		// prime no -> 2 factors = 1 & itself.
		// composite -> more than 2 factors.

		int factors = 0;

		for (int i = 2; i * i < n; i++) {

			if (n % i == 0) {
				factors++;
				break;
			}

		}

		if (factors > 0) {
			System.out.println("Composite");
		} else {
			System.out.println("Prime");
		}
	}

	public static void fibonacciSeries(int n) {
		int a = 0;
		int b = 1;

		int count = 0;

		while (count <= n) {
			int sum = a + b;
			System.out.print(a + ", ");
			a = b;
			b = sum;
			count++;
		}
	}

	public static void gcd(int a, int b) {

		for (int i = Math.min(a, b); i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}

	public static void gcd2(int a, int b) {

		// using long division method.

		int dividend = Math.max(a, b);
		int divisor = Math.min(a, b);
		int remainder = 1;

		while (true) {
			remainder = dividend % divisor;
			if (remainder == 0)
				break;
			dividend = divisor;
			divisor = remainder;
		}

		System.out.println(divisor);

	}

	public static int reverse(int n) {

		int reverse = 0;

		if (n == 0)
			return 0;

		while (n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}

		return reverse;

	}

	static int ans;

	public static void Jon(String A, String D, String E, String F) {
		if (A.length() == 0) {
			ans = 0;
			return;
		}
		int idx1 = A.indexOf(D);
		int idx2 = A.indexOf(E);
		int idx3 = A.indexOf(F);
		if (idx1 == -1 && idx2 == -1 && idx3 == -1) {
			ans = Math.min(ans, A.length());
			return;
		}
		System.out.println(A.substring(0, idx2) + A.substring(idx2 + E.length()));

//        if (idx1 != -1) {
//            String roa = A.substring(0, idx1) + A.substring(idx1 + D.length());
//            Jon(roa, D, E, F);
//        }
//        if (idx2 != -1) {
//            String roa = A.substring(0, idx2) + A.substring(idx2 + E.length());
//            Jon(roa, D, E, F);
//        }
//        if (idx3 != -1) {
//            String roa = A.substring(0, idx3) + A.substring(idx3 + F.length());
//            Jon(roa, D, E, F);
//        } 

	}

	public static int kadane(int[] arr) {

		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			sum = Math.max(sum + arr[i], arr[i]);

			if (sum > max)
				max = sum;
		}

		return max;

	}

	public static int kadane2(int[] arr) {

		int[] start = new int[arr.length];
		start[0] = 0;

		int ei = 0;

		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			int alreadyExistingAdd = sum + arr[i];
			int freshStart = arr[i];

			if (alreadyExistingAdd > freshStart)
				start[i] = start[i - 1];
			else
				start[i] = i;

			sum = Math.max(alreadyExistingAdd, freshStart);

			if (sum > max) {
				max = sum;
				ei = i;
			}
		}

		System.out.println(start[ei] + " " + ei);

		return max;

	}

	public static int circularArrayMaxSubarraySum(int[] arr) {

		// Case 1 : CE are non wrapping
		int ceNotWrapping = kadane(arr);

		// Case 2 : CE are wrapping
		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}

		int nonContributingElementSum = kadane(arr);

		System.out.println(nonContributingElementSum);
		System.out.println(totalSum);

		int ceWrapping = totalSum + nonContributingElementSum;

		return Math.max(ceNotWrapping, ceWrapping);

	}

}