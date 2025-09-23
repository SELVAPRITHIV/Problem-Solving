class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<10000;i++){
            for(int j=1;j<10000;j++){
                if(i+j==n && !String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }
}