class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int num = n - i;
            if (citations[i] >= num)
                return num;
        }
        return 0;
    }
}