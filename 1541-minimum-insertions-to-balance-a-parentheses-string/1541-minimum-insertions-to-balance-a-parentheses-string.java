class Solution {
    public int minInsertions(String s) {
        int n = s.length(), ans = 0;
        Stack<Integer> open = new Stack<>();

        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            char next = (i+1 < n) ? s.charAt(i+1) : 'x';

            if (ch == '(') {
                if (open.isEmpty())
                    open.push(1);
                else
                    open.push(open.peek() + 1);
            }
            else if (ch == ')' && next == ')') {
                if (open.isEmpty())
                    ans += 1;
                else 
                    open.pop(); 
                i++;
            }
            else {
                if (open.isEmpty())
                    ans += 2;
                else {
                    ans += 1;
                    open.pop();
                }
            }

            i++;
        }
        
        return (open.isEmpty()) ? ans : ans + 2*open.peek();
    }
}