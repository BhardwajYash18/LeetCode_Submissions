class Solution {

    private boolean validRow(char[][] board, int row) {
        boolean[] nums = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == '.') 
                continue;
            int num = board[row][i] - '1';
            if (nums[num]) 
                return false;
            nums[num] = true;
        }

        return true;
    }

    private boolean validCol(char[][] board, int col) {
        boolean[] nums = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == '.') 
                continue;
            int num = board[i][col] - '1';
            if (nums[num]) 
                return false;

            nums[num] = true;
        }

        return true;
    }

    private boolean validBox(char[][] board, int row, int col) {
        boolean[] nums = new boolean[9];

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] == '.') 
                    continue;

                int num = board[i][j] - '1';

                if (nums[num]) 
                    return false;

                nums[num] = true;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!validRow(board, i)) return false;
        }

        // Check columns
        for (int i = 0; i < 9; i++) {
            if (!validCol(board, i)) return false;
        }

        // Check 3x3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!validBox(board, row, col)) return false;
            }
        }

        return true;
    }
}