class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n*n;
        int even = n*(n+1);
        while (odd != 0) {
            int temp = odd;
            odd = even % odd;
            even = temp;
        }
        return even;
    }
}