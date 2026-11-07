class Solution {
    public String convertToTitle(int colNum) {
        StringBuilder sb = new StringBuilder();
        while (colNum > 0) {
            colNum--;
            sb.insert(0, (char) ((colNum % 26) + 'A'));
            colNum /= 26;
        }

        return sb.toString();
    }
}