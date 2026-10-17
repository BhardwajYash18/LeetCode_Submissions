class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = sum(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rank.put(arr[i][0], i);
        }
        int[] home = new int[n];
        for (int i = 0; i < n; i++) {
            home[i] = rank.get(nums[i]);
        }
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            while (home[i] != i) {
                int j = home[i];
                int temp = home[i];
                home[i] = home[j];
                home[j] = temp;
                swaps++;
            }
        }
        return swaps;
    }
    private int sum(int num) {
        int ans = 0;
        while (num > 0) {
            ans += num % 10;
            num /= 10;
        }
        return ans;
    }
}
