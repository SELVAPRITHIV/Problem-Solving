class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int maxarea = 0;
        int maxdia = 0;
        for(int i=0;i<d.length;i++){
            int dia = (d[i][0]*d[i][0] + d[i][1]*d[i][1]);
            int area = d[i][0]*d[i][1];
            if(dia>maxdia){
                maxdia = dia;
                maxarea = area;
            }
            else if(dia==maxdia){
                maxarea = Math.max(area,maxarea);
            }
        }
        return maxarea;
    }
}