class Solution {
    public boolean detectCapitalUse(String word) {

        boolean a = true;
        for(char c : word.toCharArray()){
            if(!Character.isUpperCase(c)){
                a = false;
                break;
            }
        }
        if(a) return true;
 
        a = true;
        for(char c : word.toCharArray()){
            if(Character.isUpperCase(c)){
                a = false;
                break;
            }
        }
        if(a) return true;

        a = true;
        
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                a = false;
                break;
            }
        }
        if(a) return true;
        }

        return false;
    }
}