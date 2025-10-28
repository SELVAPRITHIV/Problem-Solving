class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int index = 0;
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j:mat[i]){
                if(j==1) count++;
            }
            if(count>max){
                max = count;
                index = i;
            }
        }
        return new int[] {index,max};
    }
}