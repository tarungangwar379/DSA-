class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] != '.') {

                    char digit = board[row][col];

                    // Temporarily remove current digit
                    board[row][col] = '.';

                    // Check row, column and 3x3 box
                    if (!isSafe(board, row, col, digit)) {
                        return false;
                    }

                    // Restore digit
                    board[row][col] = digit;
                }
            }
        }

        return true;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit) {

        // Column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // Row check
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }

        // 3x3 box check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}