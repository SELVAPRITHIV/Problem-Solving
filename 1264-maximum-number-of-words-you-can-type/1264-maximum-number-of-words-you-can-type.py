class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        lst = text.split(" ")
        count = 0
        if(brokenLetters == ""):
            return len(lst)

        for i in lst:
            temp = False
            for j in brokenLetters:
                if(j not in i):
                    temp = True
                else:
                    temp = False
                    break
            if(temp):
                count+=1
        return count