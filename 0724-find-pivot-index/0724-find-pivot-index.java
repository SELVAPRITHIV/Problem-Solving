class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = 0;
            int b = 0;
            for(int j=0;j<i;j++){
                a += nums[j];
            }
            for(int j=i+1;j<n;j++){
                b += nums[j];
            }
            if(a==b){
                return i;
            }
        }
        return -1;
    }
}