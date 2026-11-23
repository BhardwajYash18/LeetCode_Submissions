class ProductOfNumbers {
    List<Integer> li = new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        li.add(num);
    }
    
    public int getProduct(int k) {
        int n = li.size(), ans = 1;
        for (int i = n - k; i < n; i++) ans *= li.get(i);
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */