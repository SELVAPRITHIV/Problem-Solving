class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // minimum possible open parentheses
        int maxOpen = 0; // maximum possible open parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // c == '*'
                minOpen--;   // treat '*' as ')'
                maxOpen++;   // treat '*' as '('
            }

            if (minOpen < 0) {
                minOpen = 0; // we can't have negative opens
            }

            if (maxOpen < 0) {
                return false; // too many closing brackets
            }
        }

        return minOpen == 0; // valid if all opens can be closed
    }
}
