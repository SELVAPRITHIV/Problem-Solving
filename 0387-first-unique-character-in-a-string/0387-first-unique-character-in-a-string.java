class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] freq = new int[26];
        
        for(int i=0;i<n;i++){
            freq[arr[i] - 'a']++;
        }

        for(int i=0;i<n;i++){
            if(freq[arr[i] - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
