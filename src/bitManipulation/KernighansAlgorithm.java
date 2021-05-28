package bitManipulation;

public class KernighansAlgorithm {

	public static void main(String[] args) {

		int x = -120;

		System.out.println(Integer.toBinaryString(x));

		int count = 0;

		while (x != 0) {

			// right most set bit mask.
			int rmsbMask = (x & (-x));

			// increasing count
			count++;

			// new x
			x = x - rmsbMask;
		}
		
		System.out.println(count);
	}

}
