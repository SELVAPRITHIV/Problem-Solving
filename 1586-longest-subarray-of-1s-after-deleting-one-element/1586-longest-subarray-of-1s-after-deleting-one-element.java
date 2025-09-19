class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            int zero = 0;
            int count = 0;
            for(int i=j;i<nums.length;i++){
                if(nums[i]==1){
                    count++; 
                } 
                else{
                    zero++;
                    if(zero>1) break;
                }
            } 
            lst.add(count);
        }
        int max = Collections.max(lst);
        if(nums.length==max) return max-1;
        if(!lst.isEmpty()) return max;
        return 0;
    }
}