class Solution {
    public boolean isValid(String s) {
        
        if (s.length() % 2 == 1) return false;

        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack[++top] = ')';
            } else if (c == '[') {
                stack[++top] = ']';
            } else if (c == '{') {
                stack[++top] = '}';
            } else {
                if (top == -1) return false;
                if (stack[top] != c) return false;
                top--;
            }
        }

        return top == -1;
    }
}
