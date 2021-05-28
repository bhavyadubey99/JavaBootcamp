package bitManipulation;

public class bitsPrinting {

	public static void main(String[] args) {

		int n = 100;

		// way - 1
		while (n != 0) {
			int rem = n & 1;
			System.out.println(rem);

			n = n / 2;
		}

		System.out.println("----------");
		// way - 2

		int x = 200;
		while (x != 0) {
			int rem = x & 1;
			System.out.println(rem);

			x = x >> 1;
		}
	}
}
