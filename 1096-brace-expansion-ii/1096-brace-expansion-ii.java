class Solution {
    TreeSet<String> set = new TreeSet<>();
    void dfs(String s) {
        int r = s.indexOf("}");
        if (r == -1){
            set.add(s);
            return;
        }
        int l = s.lastIndexOf("{",r);
        String left = s.substring(0,l);
        String between = s.substring(l+1,r);
        String right = s.substring(r+1);

        for (String str : between.split(",")){
            dfs(left + str + right);
        }
    }
    public List<String> braceExpansionII(String expression) {
        dfs(expression);
        return new ArrayList<>(set);
    }
}