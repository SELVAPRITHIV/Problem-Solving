class Solution {
    public int findClosest(int x, int y, int z) {
        int xc = 0;
        int yc = 0;
        while(x!=z){
            if(x<z){
                xc++;
                x+=1;
            }
            else{
                xc++;
                x-=1;
            }
        }

        while(y!=z){
            if(y<z){
                yc++;
                y+=1;
            }
            else{
                yc++;
                y-=1;
            }
        }

        if(xc>yc){
            return 2;
        }
        else if(yc>xc){
            return 1;
        }
        else{
            return 0;
        }
        
    }
}