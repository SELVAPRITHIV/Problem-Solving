class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" "); 
        int len = arr.length;
        String z = arr[len-1];
        int b = z.length();
        return b;
    }
}