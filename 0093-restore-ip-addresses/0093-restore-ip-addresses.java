class Solution {
    List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        helper("",0,0,s);
        return result;
    }
    private void helper(String path, int idx, int dots, String s) {
        if (dots > 4) return;
        if (dots == 4 && idx == s.length()) {
            result.add(path.substring(0, path.length() - 1));
            return;
        }

        for (int l = 1; l <= 3 && idx + l <= s.length(); l++) {
            String num = s.substring(idx, idx + l);
            if (num.charAt(0) == '0' && l != 1) break;
            else if (Integer.parseInt(num) <= 255)
                helper(path + s.substring(idx, idx + l) + ".", idx + l, dots + 1, s); 
        }
    }
}