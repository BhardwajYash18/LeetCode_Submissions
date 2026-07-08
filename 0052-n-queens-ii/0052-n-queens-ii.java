class Solution {
    int count = 0;
    public boolean isSafe(char[][] board, int row, int col, int n) {

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
    public void nQueen(char[][] board, int row, int n) {
        if (row == n){
            count++;
            return;
        }

        for (int j = 0 ; j < n ; j++) {
            if(isSafe(board,row,j,n)){
                board[row][j] = 'Q';
                nQueen(board, row+1, n);
                board[row][j] = '.';
            }

        }
    }

    public int solve(int n) {
        char[][] board = new char[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++) {
                board[i][j] = '.';
            }
        }
        count = 0;
        nQueen(board, 0, n);

        return count;
    }

    
    public int totalNQueens(int n) {
        return solve(n);
    }
}