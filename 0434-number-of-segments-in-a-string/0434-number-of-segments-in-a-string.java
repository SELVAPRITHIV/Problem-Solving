class Solution {
    public int countSegments(String s) {
        if (s.trim().isEmpty()) {  
            return 0;
        }
        int count = 0;
        boolean temp = true;
        for(char c:s.toCharArray()){
            if(c!=' ' && temp){
               count++;
               temp = false;
            }
            else if(c==' '){
                temp = true;
            }
        }
        return count;
    }
}