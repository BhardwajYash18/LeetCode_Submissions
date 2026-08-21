class Solution {
    public int[] constructRectangle(int area) {
        int wMax = (int)Math.sqrt(area);
        int[] arr = new int[2];
        int min = Integer.MAX_VALUE;
        int w = 1;
        while ( w <= wMax) {
            if (area % w == 0) {
                int l = area / w;
                if (Math.abs(l-w) <= min){
                    arr[0] = l;
                    arr[1] = w;
                }
            }
            w++; 
        } 
        return arr;
    }
}