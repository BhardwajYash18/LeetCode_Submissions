class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int k=0;
        for (int z=0;z<n;z++){
            if(nums[z]==0) i++;
            if(nums[z]==1) j++;
            if(nums[z]==2) k++;
        }
        int ind=0;
        while(i>0){
            nums[ind]=0;
            i--;
            ind++;
        }
        while(j>0){
            nums[ind]=1;
            j--;
            ind++;
        }
        while(k>0){
            nums[ind]=2;
            k--;
            ind++;
        }

    }
}