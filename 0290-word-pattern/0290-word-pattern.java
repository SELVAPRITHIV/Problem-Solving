class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        
        Map<Character, String> c = new HashMap<>();
        Map<String, Character> w = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String wd = words[i];

            if(c.containsKey(ch) && !c.get(ch).equals(wd)) return false;
            if(w.containsKey(wd) && w.get(wd) != ch) return false;

            c.put(ch,wd);
            w.put(wd,ch);
        }
        return true;
    }
}