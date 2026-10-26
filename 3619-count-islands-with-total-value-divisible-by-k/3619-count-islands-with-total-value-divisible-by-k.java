class Solution {
    public int countIslands(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length;
        int[] stack = new int[rows * cols];
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] <= 0) continue;
                int top = 0;
                long rem = grid[i][j] % k;

                grid[i][j] = 0;
                stack[top++] = i * cols + j;

                while (top > 0) {
                    int pos = stack[--top];
                    int r = pos / cols, c = pos % cols;

                    if (r > 0 && grid[r - 1][c] > 0) {
                        rem = (rem + grid[r - 1][c]) % k;
                        grid[r - 1][c] = 0;
                        stack[top++] = (r - 1) * cols + c;
                    }
                    if (r + 1 < rows && grid[r + 1][c] > 0) {
                        rem = (rem + grid[r + 1][c]) % k;
                        grid[r + 1][c] = 0;
                        stack[top++] = (r + 1) * cols + c;
                    }
                    if (c > 0 && grid[r][c - 1] > 0) {
                        rem = (rem + grid[r][c - 1]) % k;
                        grid[r][c - 1] = 0;
                        stack[top++] = r * cols + c - 1;
                    }
                    if (c + 1 < cols && grid[r][c + 1] > 0) {
                        rem = (rem + grid[r][c + 1]) % k;
                        grid[r][c + 1] = 0;
                        stack[top++] = r * cols + c + 1;
                    }
                }
                if (rem == 0) ans++;
            }
        }
        return ans;
    }
}