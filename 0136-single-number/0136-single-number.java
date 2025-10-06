class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int[] arr = {0};

        map.forEach((key,value)->{
            if(value==1){
                arr[0] = key;
            }
        });
        return arr[0];
    }
}