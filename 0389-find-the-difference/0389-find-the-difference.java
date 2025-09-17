class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:arr2){
            if(!map.containsKey(i) || map.get(i)==0){
                return i;
            }
            else{
                map.put(i,map.getOrDefault(i,0)-1);
            }
        }
        return ' ';
    }
}