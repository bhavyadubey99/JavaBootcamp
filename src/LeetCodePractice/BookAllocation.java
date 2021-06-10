package LeetCodePractice;

public class BookAllocation {

	public static void main(String[] args) {

		int[] books = { 12, 34, 67, 90 };

		int nos = 2;

		int res = bookAllocate(books, nos);

		System.out.println(res);
	}

	public static int bookAllocate(int[] books, int nos) {

		int lo = 0;

		int ans = 0;

		int hi = 0;

		for (int val : books) {

			hi += val;

		}

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (IsItPossible(books, nos, mid)) {
				// move left
				hi = mid - 1;
				ans = mid;
			} else {
				// move right
				lo = mid + 1;
			}
		}

		return ans;

	}

	public static boolean IsItPossible(int[] books, int nos, int mid) {

		// minimise the max pages
		int studentNo = 1;

		int pagesRead = 0;
		
		int i = 0; 

		while(i < books.length) {
			if (pagesRead + books[i] <= mid) {
				pagesRead += books[i];
				i++;
			} else {
				// means limit got exceeded.
				studentNo++;
				if (studentNo > nos)
					return false;
				pagesRead = 0;

			}
		}

		return true;

	}

}
