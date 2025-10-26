class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                count++;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                list.add(count);
                count = 1;
            }
        }
        list.add(count);
        int len = Collections.max(list);
        return len;
    }
}