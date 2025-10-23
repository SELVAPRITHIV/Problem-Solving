class Solution {
    public int removeElement(int[] nums, int val) {

        List<Integer> lst = new ArrayList<>();

        int sum = 0;

        for(int i:nums){
            if(i!=val){
                lst.add(i);
                sum++;
            }
        }

        for(int i=0;i<lst.size();i++){
            nums[i] = lst.get(i);
        }

        return sum;
    }
}