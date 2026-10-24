class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(date(arriveAlice), date(arriveBob));
        int end = Math.min(date(leaveAlice), date(leaveBob));

        return Math.max(0, end - start + 1);
    }

    private int date(String s) {
        String[] parts = s.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}