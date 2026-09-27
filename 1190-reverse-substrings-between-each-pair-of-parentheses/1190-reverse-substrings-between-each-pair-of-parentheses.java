class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                StringBuilder temp = new StringBuilder();
                while (stk.peek() != '(') {
                    temp.append(stk.pop());
                }
                stk.pop();
                for (int j = 0; j < temp.length(); j++) {
                    stk.push(temp.charAt(j));
                }
            } else {
                stk.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stk.isEmpty()) {
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}