class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
        for (int num : prices) {
            if (num < min1) {
                min2 = Math.min(min1, min2);
                min1 = num;
            }
            else if ( num < min2){
                min2 = num;
            }
        }
        return (min1 + min2  > money) ? money : (money - min1 - min2);
    }
}