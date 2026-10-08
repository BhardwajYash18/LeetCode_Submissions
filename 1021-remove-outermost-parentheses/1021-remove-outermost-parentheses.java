class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int bal = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c == '(' && bal++ > 0) ||(c == ')' && --bal > 0))
                sb.append(c);
        
        }

        return sb.toString();
    }
}