class Solution {
    TreeMap<Integer, Integer> left = new TreeMap<>();
    TreeMap<Integer, Integer> right = new TreeMap<>();

    int leftSize = 0, rightSize = 0;
    long leftSum = 0, rightSum = 0;

    void addLeft(int val) {
        left.merge(val, 1, Integer::sum);
        leftSize++;
        leftSum += val;
    }

    void addRight(int val) {
        right.merge(val, 1, Integer::sum);
        rightSize++;
        rightSum += val;
    }

    void removeLeft(int val) {
        left.merge(val, -1, Integer::sum);
        if (left.get(val) == 0) left.remove(val);
        leftSize--;
        leftSum -= val;
    }

    void removeRight(int val) {
        right.merge(val, -1, Integer::sum);
        if (right.get(val) == 0) right.remove(val);
        rightSize--;
        rightSum -= val;
    }

    void balance() {
        int target = (leftSize + rightSize + 1) / 2;

        while (leftSize > target) {
            int val = left.lastKey();
            removeLeft(val);
            addRight(val);
        }

        while (leftSize < target) {
            int val = right.firstKey();
            removeRight(val);
            addLeft(val);
        }
    }

    void add(int val) {
        if (left.isEmpty() || val <= left.lastKey())
            addLeft(val);
        else
            addRight(val);

        balance();
    }

    void remove(int val) {
        if (left.containsKey(val))
            removeLeft(val);
        else
            removeRight(val);

        balance();
    }

    long getCost() {
        long median = left.lastKey();

        return median * leftSize - leftSum
                + rightSum - median * rightSize;
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] cost = new long[n - x + 1];
        for (int i = 0; i < n; i++) {
            add(nums[i]);

            if (i >= x)
                remove(nums[i - x]);

            if (i >= x - 1)
                cost[i - x + 1] = getCost();
        }

        long INF = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];

        for (int j = 1; j <= k; j++)
            Arrays.fill(dp[j], INF);

        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1];

                if (i >= x && dp[j - 1][i - x] != INF) {
                    dp[j][i] = Math.min(
                        dp[j][i],
                        dp[j - 1][i - x] + cost[i - x]
                    );
                }
            }
        }

        return dp[k][n];
    }
}