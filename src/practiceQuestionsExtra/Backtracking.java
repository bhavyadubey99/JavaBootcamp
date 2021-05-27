package practiceQuestionsExtra;

public class Backtracking {

	static int count = 0;

	public static void main(String[] args) {

//		boolean[][] boxes = new boolean[4][4];
//		queenCombinationBoxRespect2DKill(boxes, 3, 0, 0, 0, "");
//
//		int[] denom = { 1, 2, 3 };
//
//		coinChangeCombinationCoinRespect(denom, 0, 4, "");
//
//		NKnights(boxes, 3, 0, 0, 0, "");

//		NQueens2(boxes, 3, 0, 0, 0, "");

//		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
//
//		blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);

		coinChangeCombinationCoinRespectCase3(new int[] { 2, 2, 2, 3, 3, 4 }, 6, 0, "", true);

	}

	public static void queenPermutation(boolean[] boxes, int tq, int qpsf, String ans) {

		// base case
		if (qpsf == tq) {
			count++;
			System.out.println(count + ".\t" + ans);
			return;

		}

		for (int i = 0; i < boxes.length; i++) {

			if (boxes[i] == false) {
				boxes[i] = true;
				queenPermutation(boxes, tq, qpsf + 1, ans + "q" + qpsf + "b" + i + " ");
				// after the above function call has completed its work.
				// means now we have to remove the queen from the place, so ->
				boxes[i] = false;

			}
		}
	}

	public static void queenCombination(boolean[] boxes, int tq, int qpsf, int lbu, String ans) {

		// lbu --> last box used

		// base case
		if (qpsf == tq) {
			count++;
			System.out.println(count + ".\t" + ans);
			return;

		}

		for (int i = lbu + 1; i < boxes.length; i++) {

			boxes[i] = true;
			queenCombination(boxes, tq, qpsf + 1, i, ans + "q" + qpsf + "b" + i + " ");
			// after the above function call has completed its work.
			// means now we have to remove the queen from the place, so ->
			boxes[i] = false;

		}
	}

	public static void coinChangeCombination(int[] denom, int amount, int idxOfldu, String ans) {
		// ldu - last denom used.

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idxOfldu; i < denom.length; i++) {

			if (amount >= denom[i])
				coinChangeCombination(denom, amount - denom[i], i, ans + denom[i]);
		}

	}

	public static void coinChangePermutation(int[] denom, int amount, String ans) {
		// ldu - last denom used.

		if (amount == 0) {
			count++;
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < denom.length; i++) {

			if (amount >= denom[i])
				coinChangePermutation(denom, amount - denom[i], ans + denom[i]);
		}

	}

	public static void queenCombinationBoxrespect(boolean[] boxes, int tq, int qpsf, int vidx, String ans) {

		// base cases
		// positive
		if (qpsf == tq) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		// negative
		// function crosses boundary of board.
		if (vidx == boxes.length) {
			return;
		}

		// placing the queen
		boxes[vidx] = true;
		queenCombinationBoxrespect(boxes, tq, qpsf + 1, vidx + 1, ans + "b" + vidx + "q" + qpsf + " ");
		// after coming back from the function frame of above call, we have to undo
		// stuff.
		boxes[vidx] = false;

		// not placing the queen
		queenCombinationBoxrespect(boxes, tq, qpsf, vidx + 1, ans);
	}

	public static void coinChangeCombinationCoinRespect(int[] denom, int vidx, int amount, String ans) {

		// base cases

		// positive --> amount is made. --> means now amount is 0.
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		// negative 1 --> amount becomes negative.
		if (amount < 0) {
			return;
		}

		// negative 2 --> amount is yet to made, but no coin choices are left.
		if (vidx == denom.length) {
			return;
		}

		// vidx --> virtual index --> shows which would be the index of denom start.

		// the first coin in denom array agrees to contribute in making the amount.
		coinChangeCombinationCoinRespect(denom, vidx, amount - denom[vidx], ans + denom[vidx]);

		// the first coin refuses to contribute.
		coinChangeCombinationCoinRespect(denom, vidx + 1, amount, ans);

	}

	public static void queenCombinationBoxRespect2D(boolean[][] board, int tq, int qpsf, int rowVidx, int colVidx,
			String ans) {

		// base cases
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (rowVidx < board.length && colVidx < board[0].length) {
			// placed in the cell
			board[rowVidx][colVidx] = true;
			queenCombinationBoxRespect2D(board, tq, qpsf + 1, rowVidx, colVidx + 1,
					ans + "b" + rowVidx + colVidx + " ");
			board[rowVidx][colVidx] = false;

			// not placed
			queenCombinationBoxRespect2D(board, tq, qpsf, rowVidx, colVidx + 1, ans);

		} else if (colVidx == board[0].length) {
			queenCombinationBoxRespect2D(board, tq, qpsf, rowVidx + 1, 0, ans);

		} else if (rowVidx == board.length) {
			return;
		}

	}

	public static void queenCombinationBoxRespect2DKill(boolean[][] board, int tq, int qpsf, int rowVidx, int colVidx,
			String ans) {

		// base cases
		// positive
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		// value change
		if (colVidx == board[0].length) {
			queenCombinationBoxRespect2DKill(board, tq, qpsf, rowVidx + 1, 0, ans);
			return;

		}

		// out of board.
		if (rowVidx == board.length) {
			return;
		}

		if (isItSafeToPlaceQueen(board, rowVidx, colVidx)) {
			// placed in the cell only if it is safe.
			board[rowVidx][colVidx] = true;
			queenCombinationBoxRespect2DKill(board, tq, qpsf + 1, rowVidx, colVidx + 1,
					ans + "b" + rowVidx + colVidx + " ");
			board[rowVidx][colVidx] = false;
		}

		// not placed
		queenCombinationBoxRespect2DKill(board, tq, qpsf, rowVidx, colVidx + 1, ans);

	}

	public static boolean isItSafeToPlaceQueen(boolean[][] board, int rowVidx, int colVidx) {

		int row = rowVidx - 1;
		int col = colVidx;

		// checking vertically upward.
		while (row >= 0) {
			if (board[row][col]) {
				return false;
			}
			row--;
		}

		// checking horizontally left.
		row = rowVidx;
		col = colVidx - 1;
		while (col >= 0) {
			if (board[row][col]) {
				return false;
			}
			col--;
		}

		// checking diagonal left.
		// here i will have to decrease both row and col.
		row = rowVidx - 1;
		col = colVidx - 1;

		while (row >= 0 && col >= 0) {
			if (board[row][col]) {
				return false;
			}
			row--;
			col--;
		}

		// diagonally right.
		// here row will decrease, but col will increase.
		row = rowVidx - 1;
		col = colVidx + 1;

		while (row >= 0 && col < board[0].length) {
			if (board[row][col]) {
				return false;
			}
			row--;
			col++;
		}

		// if none of the above loops return false, means no queen can kill, and its
		// safe to be placed.
		return true;

	}

	public static void NQueens(boolean[][] board, int tq, int qpsf, int rowVidx, int colVidx, String ans) {

		// base cases
		// positive
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		// value change
		if (colVidx == board[0].length) {
			NQueens(board, tq, qpsf, rowVidx + 1, 0, ans);
			return;

		}

		// out of board.
		if (rowVidx == board.length) {
			return;
		}

		if (isItSafeToPlaceQueen(board, rowVidx, colVidx)) {
			// placed in the cell only if it is safe.
			board[rowVidx][colVidx] = true;
			NQueens(board, tq, qpsf + 1, rowVidx + 1, 0, ans + "b" + rowVidx + colVidx + " ");
			board[rowVidx][colVidx] = false;
		}

		// not placed
		NQueens(board, tq, qpsf, rowVidx, colVidx + 1, ans);

	}

	public static void NKnights(boolean[][] board, int tk, int kpsf, int rowVidx, int colVidx, String ans) {

		// base cases
		// positive
		if (tk == kpsf) {
			System.out.println(++count + ". " + ans);
			return;
		}

		// value change.
		if (colVidx == board[0].length) {
			rowVidx += 1;
			colVidx = 0;
		}

		// negative
		if (rowVidx == board.length) {
			return;
		}

		if (isItSafeToPlaceKnight(board, rowVidx, colVidx)) {
			// wrt to board.
			// gets placed.
			board[rowVidx][colVidx] = true;
			NKnights(board, tk, kpsf + 1, rowVidx, colVidx + 1, ans + "B" + rowVidx + colVidx + " ");
			// reset
			board[rowVidx][colVidx] = false;
		}
		// not placed.
		NKnights(board, tk, kpsf, rowVidx, colVidx + 1, ans);

	}

	public static boolean isItSafeToPlaceKnight(boolean[][] board, int rowVidx, int colVidx) {

		int[] rowArray = { -1, -2, -2, -1 };
		int[] colArray = { 2, 1, -1, -2 };

		for (int i = 0; i < 4; i++) {

			int r = rowVidx + rowArray[i];
			int c = colVidx + colArray[i];

			if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
				if (board[r][c]) {
					return false;
				}
			}
		}

		return true;
	}

	public static void NQueens2(boolean[][] board, int tq, int qpsf, int rowVidx, int colVidx, String ans) {

		// base cases.
		// positive
		if (tq == qpsf) {
			System.out.println(++count + ". " + ans);
			return;
		}

		// value change
		if (colVidx == board[0].length) {
			NQueens2(board, tq, qpsf, rowVidx + 1, 0, ans);
			return;
		}

		// negative
		if (rowVidx == board.length) {
			return;
		}

		// box respect approach

		if (isItSafeToPlaceQueen(board, rowVidx, colVidx)) {
			// placed
			board[rowVidx][colVidx] = true;
			NQueens2(board, tq, qpsf + 1, rowVidx + 1, 0, ans + "B" + rowVidx + colVidx + " ");
			board[rowVidx][colVidx] = false;
		}
		// not placed
		NQueens2(board, tq, qpsf, rowVidx, colVidx + 1, ans);

	}

	public static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {

		// base case
		// positive
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}

		// negative
		if (row < 0 || row == maze.length || col < 0 || col == maze[0].length || maze[row][col] == 1
				|| visited[row][col]) {
			return;
		}

		// BP : 0,0 to somewhere else.

		// put a mark
		visited[row][col] = true;

		// SPs :

		// Top
		blockedMaze(maze, row - 1, col, ans + "T", visited);

		// Down
		blockedMaze(maze, row + 1, col, ans + "D", visited);

		// Left
		blockedMaze(maze, row, col - 1, ans + "L", visited);

		// Right
		blockedMaze(maze, row, col + 1, ans + "R", visited);

		// reset
		visited[row][col] = false;

	}

	public static void coinChangeCombinationUserRespectCase2(int[] denom, int amt, int vidx, String ans) {

		// base cases
		// positive
		if (amt == 0) {
			System.out.println(ans);
			return;
		}

		// negative
		if (amt < 0 || vidx == denom.length) {
			return;
		}

		for (int i = vidx; i < denom.length; i++) {

			coinChangeCombinationUserRespectCase2(denom, amt - denom[i], i + 1, ans + denom[i]);

		}

	}

	public static void coinChangeCombinationCoinRespectCase2(int[] denom, int amt, int vidx, String ans) {

		// base cases
		// positive
		if (amt == 0) {
			System.out.println(ans);
			return;
		}

		// negative
		if (vidx == denom.length || amt < 0) {
			return;
		}

		// include
		coinChangeCombinationCoinRespectCase2(denom, amt - denom[vidx], vidx + 1, ans + denom[vidx]);

		// exclude
		coinChangeCombinationCoinRespectCase2(denom, amt, vidx + 1, ans);

	}

	public static void coinChangeCombinationUserRespectCase3(int[] denom, int amt, int vidx, String ans) {

		// base case
		if (amt == 0) {
			System.out.println(ans);
			return;
		}

		if (amt < 0 || vidx == denom.length) {
			return;
		}

		for (int i = vidx; i < denom.length; i++) {
			if (i == vidx || denom[i] != denom[i - 1])
				coinChangeCombinationUserRespectCase3(denom, amt - denom[i], i + 1, ans + denom[i]);

		}
	}

	public static void coinChangeCombinationCoinRespectCase3(int[] denom, int amt, int vidx, String ans, boolean flag) {
		// flag represents whether exclude(false) call was given last, or include.(true)

		// base case
		if (amt == 0) {
			System.out.println(ans);
			return;
		}

		if (amt < 0 || vidx == denom.length) {
			return;
		}

		if (flag == false && denom[vidx] == denom[vidx - 1]) {
			// exclude call was given earlier..
			// so include call will not be given

			// exclude
			coinChangeCombinationCoinRespectCase3(denom, amt, vidx + 1, ans, false);
		}

		else {
			// include
			coinChangeCombinationCoinRespectCase3(denom, amt - denom[vidx], vidx + 1, ans + denom[vidx], true);

			// exclude
			coinChangeCombinationCoinRespectCase3(denom, amt, vidx + 1, ans, false);
		}
	}

}
