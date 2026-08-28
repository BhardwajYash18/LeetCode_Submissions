class Solution {
    public int bulbSwitch(int n) {
        // boolean[] bulb = new boolean[n+1];
        // for (int i = 1; i <= n; i++) {
        //     int x = i;
        //     while (x <= n) {
        //         bulb[x] = !bulb[x];
        //         x += i;
        //     }
        // }
        // int count = 0;
        // for (boolean b : bulb) {
        //     if (b) {
        //         count++;
        //     }
        // }
        // return count;
        return (int)Math.sqrt(n);
    }
}