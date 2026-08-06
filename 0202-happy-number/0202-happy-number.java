class Solution {
    public boolean isHappy(int n) {
        return helper(n, new HashSet<>());
    }
    private boolean helper(int n, Set<Integer> seen) {
        if (n == 1) return true;
        if (seen.contains(n)) return false;

        seen.add(n);
        
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }

        return helper(sum, seen);
    }
}