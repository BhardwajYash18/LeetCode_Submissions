class Solution {
    public int[] validSequence(String word1, String word2) {
        if (word1.length() < word2.length()) 
            return new int[0];

        int n = word1.length();
        int m = word2.length();
        int[] suffix = buildSuffix(word1, word2);
        int[] ans = new int[m];

         int i = 0;
        boolean used = false;

        for (int j = 0; j < m; j++) {

            boolean found = false;

            while (i < n) {

                if (word1.charAt(i) == word2.charAt(j)) {
                    ans[j] = i;
                    i++;
                    found = true;
                    break;
                }

                if (!used && (j == m - 1 || suffix[j + 1] > i)) {
                    ans[j] = i;
                    used = true;
                    i++;
                    found = true;
                    break;
                }

                i++;
            }

            if (!found)
                return new int[0];
        }

        return ans;
    }
    private int[] buildSuffix(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] suffix = new int[m];

        int i = n - 1;

        for (int j = m - 1; j >= 0; j--) {

            while (i >= 0 && word1.charAt(i) != word2.charAt(j)) {
                i--;
            }

            if (i < 0) {
                suffix[j] = -1;
                return suffix;
            }

            suffix[j] = i;
            i--;
        }

        return suffix;
    }
}