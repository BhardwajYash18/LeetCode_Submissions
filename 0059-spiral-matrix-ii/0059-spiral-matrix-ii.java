class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int left = 0, right = n-1;
        int top = 0, bot = n-1;
        int i = 1;
        while (top<=bot && left<=right) {
            for (int j = left ; j <= right ; j++){
                mat[top][j] = i++;
            }
            top++;
            for (int j = top ; j <= bot ;j++) {
                mat[j][right] = i++;
            }
            right--;
            for (int j = right ; j >= left ; j--) {
                mat[bot][j] = i++;
            }
            bot--;
            for (int j = bot ; j >= top ; j--) {
                mat[j][left] = i++;
            }
            left++;
        }
        return mat;
    }
}