class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = magazine.toCharArray();
        char[] arr1 = ransomNote.toCharArray();
        for(char c : arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map.containsKey(arr1[i]) && map.get(arr1[i])>0){
                map.put(arr1[i],map.getOrDefault(arr1[i],0)-1);
            }
            else{
                return false;
            }

        }
        return true;
    }
}