class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int n = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < n)
                return true;
            
            while (!stk.isEmpty() && stk.peek() < nums[i]) {
                n = stk.peek();
                stk.pop();
            }

            stk.push(nums[i]);
        }
        return false;
    }
}