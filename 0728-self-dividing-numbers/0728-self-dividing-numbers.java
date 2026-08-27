class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (func(i)){
                result.add(i);
            }
        }
        return result;
    }
    private boolean func(int num) {
        int x = num;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d == 0){
                return false;
            }
            else {
                if (num % d != 0)
                    return false;
            }
        }
        return true;
    }
}