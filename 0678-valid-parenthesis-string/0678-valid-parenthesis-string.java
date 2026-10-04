class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> star = new Stack<>();
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '('){
                stk.push(i);
            }
            else if (s.charAt(i) == '*') {
                star.push(i);
            }
            else if (s.charAt(i) == ')' && !stk.isEmpty()){
                stk.pop();
            }
            else if (s.charAt(i) == ')' && stk.isEmpty() && !star.isEmpty()) {
                star.pop();
            }
            else 
                return false;
        }
        
        while ((!stk.isEmpty() && !star.isEmpty()) && (stk.peek() < star.peek())) {
            stk.pop();
            star.pop();
        }
        
        return stk.isEmpty();
    }
}