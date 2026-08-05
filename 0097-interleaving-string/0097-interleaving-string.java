class Solution {
    private Boolean[][] memo;
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) 
            return false;
        
        memo = new Boolean[s1.length() + 1][s2.length() + 1];
        return dfs(0,0,s1,s2,s3);
    }
    private boolean dfs(int i, int j, String s1, String s2, String s3) {

        if (memo[i][j] != null) 
            return memo[i][j];
        
        int k = i + j;

        if (k == s3.length())
            return true;
        
        boolean ans = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) 
            ans = dfs(i+1, j, s1, s2, s3);
        
        if (!ans && j < s2.length() && s2.charAt(j) == s3.charAt(k))
            ans = dfs(i, j + 1, s1, s2, s3);
        
        memo[i][j] = ans;
        return ans;
    }
}