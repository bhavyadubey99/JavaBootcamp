package practiceQuestionsExtra;

public class PatternPractice {

	public static void main(String[] args) {
		pattern33(5);
	}

	public static void pattern1(int n) {
		// how many rows.
		// n rows.

		// work in every row?
		// print n stars.

		// changes to go in another row?
		// syso(\n);

		int row = 1;

		int nst = n;

		while (row <= n) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			System.out.println();
			row++;
		}
	}

	public static void pattern2(int n) {

		// rows? --> n
		int row = 1;

		// no of stars.
		int nst = 1;

		while (row <= n) {

			// work in each row.
			// print nst no of stars.
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}
			// work?
			System.out.println();
			row++;
			nst++;
		}

	}

	public static void pattern3(int n) {

		// rows --> n
		int row = 1;

		int nst = n;

		while (row <= n) {

			// work in each row. nst no of stars to be printed.
			for (int cst = 1; cst <= nst; cst++) {

				System.out.print("* ");
			}

			nst--;
			row++;
			System.out.println();
		}

	}

	public static void pattern4(int n) {

		// rows ---> n

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// work ?
			System.out.println();
			row++;
			nsp--;
			nst++;

		}
	}

	public static void pattern5(int n) {

		int row = 1;

		int nsp = 0;

		int nst = n;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// work
			System.out.println();
			row++;
			nsp++;
			nst--;
		}
	}

	public static void pattern6(int n) {

		int row = 1;

		int nsp = 0;

		int nst = n;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// work
			System.out.println();
			row++;
			nst--;
			nsp = nsp + 2;

		}
	}

	public static void pattern7(int n) {

		int row = 1;

		int nst = n;

		while (row <= n) {

			for (int cst = 1; cst <= nst; cst++) {
				if (row == 1 || row == n || cst == 1 || cst == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			// work
			System.out.println();
			row++;
		}

	}

	public static void pattern8(int n) {

		int row = 1;

		int nst = n;

		while (row <= n) {

			for (int cst = 1; cst <= nst; cst++) {

				if (cst == row || cst + row == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			// work
			System.out.println();
			row++;

		}
	}

	public static void pattern9(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// work

			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

	public static void pattern10(int n) {

		int row = 1;

		int nsp = 0;

		int nst = (2 * n) - 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// work

			System.out.println();
			row++;
			nsp++;
			nst = nst - 2;
		}

	}

	public static void pattern11(int n) {

		int row = 1;

		int nsp = n - 1;

		int nst = 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			// work

			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

	public static void pattern12(int n) {

		int row = 1;

		int nsp = n - 1;

		int nst = 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0)
					System.out.print("* ");
				else
					System.out.print("! ");
			}

			// work

			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

	public static void pattern13(int n) {

		int row = 1;

		int nst = 1;

		while (row <= (2 * n) - 1) {

			// work in each row?
			// print nst no of stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// work to go to next row?
			System.out.println();
			if (row < n)
				nst++;
			else
				nst--;
			row++;
		}
	}

	public static void pattern14(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= (2 * n) - 1) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			if (row < n) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}
			row++;
			System.out.println();
		}
	}

	public static void pattern15(int n) {

		int row = 1;

		int nst = n;

		int nsp = 0;

		while (row <= (2 * n) - 1) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("   ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*  ");
			}

			// work
			System.out.println();
			if (row < n) {
				nsp = nsp + 2;
				nst = nst - 1;
			} else {
				nsp = nsp - 2;
				nst = nst + 1;
			}

			row++;

		}
	}

	public static void pattern16(int n) {

		int row = 1;

		int nsp = n - 1;

		int nst = n;

		while (row <= (2 * n) - 1) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			System.out.println();
			if (row < n) {
				nst--;
				nsp--;
			} else {
				nst++;
				nsp++;
			}
			row++;
		}

	}

	public static void pattern17(int n) {

		int row = 1;

		int nst = n / 2;

		int nsp = 1;

		while (row <= n) {

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			System.out.println();

			if (row <= n / 2) {
				nst--;
				nsp = nsp + 2;
			} else {
				nst++;
				nsp = nsp - 2;
			}

			row++;

		}
	}

	public static void pattern18(int n) {

		int row = 1;

		int nsp = n / 2;

		int nst = 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes

			System.out.println();

			if (row <= n / 2) {
				nsp--;
				nst = nst + 2;
			} else {
				nsp++;
				nst = nst - 2;
			}

			row++;
		}
	}

	public static void pattern19(int n) {

		int row = 1;

		int nst = n / 2 + 1;

		int nsp = -1;

		while (row <= n) {

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			int cst = 1;
			if (row == 1 || row == n)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes

			System.out.println();

			if (row <= n / 2) {
				nsp = nsp + 2;
				nst--;
			} else {
				nsp = nsp - 2;
				nst++;
			}

			row++;
		}
	}

	public static void pattern20(int n) {
		int row = 1;

		int nst = 1;

		int nsp1 = n / 2;

		int nsp2 = -1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// spaces
			for (int csp = 1; csp <= nsp2; csp++) {
				System.out.print("  ");
			}

			// stars
			int cst = 1;
			if (row == 1 || row == n)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			System.out.println();
			if (row <= n / 2) {
				nsp1--;
				nsp2 = nsp2 + 2;
			} else {
				nsp1++;
				nsp2 = nsp2 - 2;
			}

			row++;

		}
	}

	public static void pattern21(int n) {
		int row = 1;

		int nst = 1;

		int nsp = (2 * n) - 2;

		while (row <= n) {
			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			int cst = 1;
//			if (row == n)
//				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			System.out.println();
			row++;
			nst++;
			nsp = nsp - 2;

		}
	}

	public static void pattern22(int n) {

		int row = 1;

		int nst = n;

		int nsp = -1;

		while (row <= n) {

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			int cst = 1;
			if (row == 1)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			System.out.println();
			row++;
			nst--;
			nsp = nsp + 2;
		}
	}

	public static void pattern23(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("1 ");
			}

			// work

			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

	public static void pattern24(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(row + " ");
			}

			// work

			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

	public static void pattern25(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		int val = 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}

			// changes
			System.out.println();
			row++;
			nst += 2;
			nsp--;
		}
	}

	public static void pattern26(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			int val = 1;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}

			// changes
			System.out.println();
			row++;
			nst += 2;
			nsp--;
		}
	}

	public static void pattern27(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			int val = 1;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if (cst > nst / 2) {
					val--;
				} else {
					val++;
				}
			}

			// changes
			System.out.println();
			row++;
			nst += 2;
			nsp--;
		}
	}

	public static void pattern28(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		while (row <= n) {

			int val = row;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if (cst > nst / 2)
					val--;
				else
					val++;
			}

			// changes
			System.out.println();
			row++;
			nst += 2;
			nsp--;
		}
	}

	public static void pattern29(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n - 1;

		int val = 1;

		while (row <= n) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == nst) {
					System.out.print(val + "\t");
				} else {
					System.out.print("0\t");
				}
			}

			// changes
			System.out.println();
			row++;
			nst += 2;
			nsp--;
			val++;
		}
	}

	public static void pattern30(int n) {

		int row = 1;

		int nst = n;

		while (row <= n) {

			int val = n;

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val--;
			}

			// changes
			System.out.println();
			row++;
		}
	}

	public static void pattern31(int n) {

		int row = 1;

		int nst = n;

		while (row <= n) {

			int val = n;

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				if (cst + row == n + 1) {
					System.out.print("*\t");
				} else {
					System.out.print(val + "\t");
				}
				val--;
			}

			// changes
			System.out.println();
			row++;
		}
	}

	public static void pattern32(int n) {

		int row = 1;

		int nst = 1;

		int val = 1;

		while (row <= (2 * n) - 1) {

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0)
					System.out.print(val + "\t");
				else
					System.out.print("*\t");
			}

			// changes
			System.out.println();
			System.out.println();
			if (row < n) {
				nst += 2;
				val++;
			} else {
				nst -= 2;
				val--;
			}

			row++;
		}
	}

	public static void pattern33(int n) {
		
		int row = 1;
		
		int nst = 1; 
		
		int nsp = n - 1; 
		
		int val1 = n; 
		
		while(row <= n) {
			
			int val2= val1;
			
			//spaces
			for(int csp = 1; csp <= nsp;csp++) {
				System.out.print("  \t");
			}
			
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == nst/2 + 1) {
					System.out.print("0\t");
					val2--;
				}
				else if (cst > nst/2) {
					System.out.print(val2 + "\t");
					val2--;
				}
				else {
					System.out.print(val2 + "\t");
					val2++;
				}
			}
			
			//changes
			System.out.println();
			nst += 2; 
			nsp--;
			row++;
			val1--;
		}

	}
}
