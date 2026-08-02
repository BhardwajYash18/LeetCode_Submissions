class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0 ; i < numRows ; i++) {
            int size = i + 1;
            List<Integer> row = new ArrayList<>(size);
            for (int col = 0; col < size ; col++) {
                if (col == 0 || col == i) row.add(1);
                else {
                    int curr = result.get(i-1).get(col-1) + result.get(i-1).get(col);
                    row.add(curr);
                }
            }
            result.add(row);
        }
        return result;
    }
}