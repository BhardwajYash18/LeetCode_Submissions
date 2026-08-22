class Solution {
    public int calculate(String s) {
        int res = 0;
        int n = 0;
        int sign = 1;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            }
            else if (c == '+') {
                res += sign * n;
                n = 0;
                sign = 1;
            }
            else if (c == '-') {
                res += sign * n;
                n = 0;
                sign = -1;
            }
            else if (c == '(') {
                st.push(res);
                st.push(sign);

                res = 0;
                sign = 1;
            }
            else if (c == ')') {
                res += sign * n;
                n = 0;

                int oldSign = st.pop();
                int oldRes = st.pop();

                res = oldRes + oldSign * res;
                sign = 1;
            }
        }

        res += sign * n;

        return res;
    }
}