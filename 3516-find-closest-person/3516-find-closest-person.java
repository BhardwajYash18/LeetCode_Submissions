class Solution {
    public int findClosest(int x, int y, int z) {
        int p1 = Math.abs(z-x);
        int p2 = Math.abs(z-y);

        return p1 == p2 ? 0 : (p1 < p2 ? 1 : 2);
    }
}