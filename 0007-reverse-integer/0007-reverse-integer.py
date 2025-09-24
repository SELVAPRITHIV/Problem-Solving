class Solution(object):
    def reverse(self, x):
        b = x
        if(b<0):
            b*=-1
        temp = 0
        while(b>0):
            temp = temp*10 + b%10
            b//=10
        if(x<0):
            temp*=-1
        if(temp>2**31-1 or temp<-2**31):
            return 0
        return temp

        