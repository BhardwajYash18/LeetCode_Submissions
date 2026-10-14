class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";
        StringBuilder res = new StringBuilder();

        while (num > 0) {
            int dig = Math.min(9,sum);
            res.append(dig);
            sum -= dig;
            num--;
        }

        return sum == 0 ? res.toString() : "";
    }
}