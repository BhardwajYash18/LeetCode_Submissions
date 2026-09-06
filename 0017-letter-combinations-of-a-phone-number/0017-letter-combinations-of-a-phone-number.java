class Solution {
    public HashMap<Character, List<Character>> map = new HashMap<>();

    public Solution() {
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        backtrack(digits, 0, "", res);

        return res;
    }

    private void backtrack(String digits, int index, String current, List<String> res) {
        if (index == digits.length()) {
            res.add(current);
            return;
        }

        char digit = digits.charAt(index);

        for (char ch : map.get(digit)) {
            backtrack(digits, index + 1, current + ch, res);
        }
    }
}