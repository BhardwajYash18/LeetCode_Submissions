class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(Arrays.asList(intervals));
        result.add(newInterval);
        Collections.sort(result, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> answer = new ArrayList<>();
        int[] curr = result.get(0);

        for (int i = 1; i < result.size(); i++) {
            int[] interval = result.get(i);
            if (curr[1] >= interval[0])
                curr[1] = Math.max(curr[1], interval[1]);
            else {
                answer.add(curr);
                curr = interval;
            }
        } 
        answer.add(curr);
        return answer.toArray(new int[answer.size()][]);
    }
}