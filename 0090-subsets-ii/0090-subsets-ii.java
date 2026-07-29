class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num : nums){
            int size = result.size();
            for(int i = 0; i< size ; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                if (!result.contains(subset)){
                    result.add(subset);
                }
            }
        }
        return result;
    }
}