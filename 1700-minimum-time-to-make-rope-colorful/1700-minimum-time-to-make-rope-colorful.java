class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int max = neededTime[0];
        for(int i=0;i<neededTime.length-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                time += Math.min(max,neededTime[i+1]);
                max = Math.max(max,neededTime[i+1]);
            }
            else{
                max = neededTime[i+1];
            }
        }
        return time;
    }
}