class Solution {
    private List<String> result = new ArrayList<>();

    private int[] balance(String s) {
        int close = 0, open = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }

        return new int[]{open, close};
    }

    private boolean isValid(String s) {
        int bal = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                bal++;
            } else if (ch == ')') {
                bal--;
                if (bal < 0) {
                    return false;
                }
            }
        }

        return bal == 0;
    }

    private void backtrack(String s, int index, int l_remove, int r_remove) {
        if (l_remove == 0 && r_remove == 0) {
            if (isValid(s)) {
                result.add(s);
            }
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (i > index && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            if (s.charAt(i) == '(' && l_remove > 0) {
                String next = s.substring(0, i) + s.substring(i + 1);
                backtrack(next, i, l_remove - 1, r_remove);
            }

            if (s.charAt(i) == ')' && r_remove > 0) {
                String next = s.substring(0, i) + s.substring(i + 1);
                backtrack(next, i, l_remove, r_remove - 1);
            }
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        int[] rem = balance(s);
        backtrack(s, 0, rem[0], rem[1]);
        return result;
    }
}