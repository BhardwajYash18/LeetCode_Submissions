class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1) return chars.length;
        int read = 0,write = 0;
        while (read < chars.length) {
            char curr = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == curr){
                read++;
                count++;
            }

            chars[write++] = curr;
            if (count > 1){
                String str = Integer.toString(count);
                for (char c : str.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;

    }
}