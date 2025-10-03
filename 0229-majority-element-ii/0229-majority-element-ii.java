class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n =  nums.length/3;
        int a = Collections.max(map.values());
        List<Integer> lst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                lst.add(entry.getKey());
            }
        }
        return lst;
    }
}