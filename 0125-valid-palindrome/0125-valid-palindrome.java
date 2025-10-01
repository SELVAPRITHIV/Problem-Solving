class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toLowerCase();
        Stack<Character> stk = new Stack<>();
        for(char i : s.toCharArray()){
            stk.push(i);
        }
        for(char i : s.toCharArray()){
            char az = stk.peek();
            stk.pop();
            if(i==az){
                continue;
            }
            else{
                return false;
            }           
            
        }
        return true;
    }
}