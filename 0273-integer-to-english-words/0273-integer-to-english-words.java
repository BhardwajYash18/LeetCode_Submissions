class Solution {
    private final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        String[] units = {"", "Thousand", "Million", "Billion"};
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (num > 0) {
            int chunk = num % 1000;

            if (chunk != 0) {
                StringBuilder part = helper(chunk);
                if (!units[i].isEmpty()) part.append(" ").append(units[i]);
                if (sb.length() > 0) part.append(" ").append(sb);
                sb = part;
            }

            num /= 1000;
            i++;
        }

        return sb.toString();
    }

    private StringBuilder helper(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 100) {
            sb.append(ones[num / 100]).append(" Hundred");
            num %= 100;
            if (num > 0) sb.append(" ");
        }

        if (num >= 20) {
            sb.append(tens[num / 10]);
            num %= 10;
            if (num > 0) sb.append(" ");
        } else if (num >= 10) {
            sb.append(teens[num - 10]);
            return sb;
        }

        if (num > 0) sb.append(ones[num]);

        return sb;
    }
}