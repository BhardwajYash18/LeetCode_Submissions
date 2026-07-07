class Solution {
    public long sumAndMultiply(int n) {
        String str = Integer.toString(n);
        long sum = 0;
        long x = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            int dig = str.charAt(i) - '0';
            if (dig != 0) {
                x = x*10 + dig;
                sum += dig;
            }
        }

        return (long)(sum*x);
    }
}