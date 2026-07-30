class Solution {
    public List<Integer> grayCode(int n) {
        int k = 1<<n;
        List<Integer> list = new ArrayList<>(k);
        for (int i=0 ; i<k ;i++){
            list.add(i ^ (i>>1));
        }
        return list;
    }

}