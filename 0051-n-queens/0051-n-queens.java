class Solution {
    public boolean isSafe(char[][] board,int row, int col, int n) {
        //Horizontal
        for( int j=0 ; j<n ; j++){
            if(board[row][j] == 'Q') return false;
        }

        //vertical
        for( int i=0 ; i<n ; i++ ){
            if(board[i][col] == 'Q') return false;
        }

        // left diagonal
        for (int i = row , j = col ; i >= 0 && j >=0 ; i--,j--){
            if(board[i][j] == 'Q') return false;
        }

        //right diagonal
        for (int i = row , j = col ; i >= 0 && j < n ; i--,j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
    public void nQueen(char[][] board, int row, int n, List<List<String>> ans) {
        if (row == n){
            List<String> solution = new ArrayList<>();
            for (int i = 0 ; i < n ; i++){
                solution.add(new String(board[i]));
            }
            ans.add(solution);
            return;
        }

        for (int j = 0 ; j < n ; j++) {
            if(isSafe(board,row,j,n)){
                board[row][j] = 'Q';
                nQueen(board, row+1, n, ans);
                board[row][j] = '.';
            }

        }
    }

    public List<List<String>> solve(int n) {
        char[][] board = new char[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nQueen(board, 0, n, ans);

        return ans;
    }

    public List<List<String>> solveNQueens(int n) {
        return solve(n);
    }
}