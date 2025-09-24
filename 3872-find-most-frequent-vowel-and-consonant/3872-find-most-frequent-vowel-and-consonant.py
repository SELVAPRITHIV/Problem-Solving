class Solution(object):
    def maxFreqSum(self, s):
        vowels = "aeiou"
        vow = {}
        con = {}
        for i in s:
            if i in vowels:
                vow[i] = vow.get(i,0)+1
            else:
                con[i] = con.get(i,0)+1
        
        vow_val = max(vow.values()) if vow else 0
        con_val = max(con.values()) if con else 0
        
        return vow_val+con_val

    


        