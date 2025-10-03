class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int a = 0;
        for(int i:nums){
            if(i==1){
                a++;
            }
            else{
                a = 0;
            }
            lst.add(a);
        }
        return Collections.max(lst);
    }
}