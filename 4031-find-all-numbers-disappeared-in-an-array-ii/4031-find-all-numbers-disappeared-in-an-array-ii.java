class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        // Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) 
            set.add(num);
        
        List<Integer> missing = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if(!set.contains(i))
                missing.add(i);
        }
        int i = 0;
        while (i < missing.size()) {
            int start = missing.get(i);
            int end = start;

            while (i+1 < missing.size() && missing.get(i+1) == missing.get(i) + 1){
                i++;
                end = missing.get(i);
            }
            List<Integer> li = new ArrayList<>();
            li.add(start);
            li.add(end);

            result.add(li);
            i++;
        }
        return result;

    }
}