class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int f = 0 , r = numbers.length - 1;
        while (f < r) {
            if (numbers[f] + numbers[r] == target) {
                res[0] = f+1;
                res[1] = r+1;
                break;
            }
            else if (target - numbers[r] > numbers[f]) f++;
            else r--;
        }
        return res;
    }
}