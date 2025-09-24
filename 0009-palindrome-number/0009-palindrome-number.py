class Solution(object):
    def isPalindrome(self, x):
        a = x
        temp = 0
        while(a>0):
            temp = temp*10 + a%10
            a//=10
        if(x==temp):
            return True
        else:
            return False
        