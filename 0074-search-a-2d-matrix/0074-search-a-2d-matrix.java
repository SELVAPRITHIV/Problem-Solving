class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int len = matrix[i].length-1;
            if(matrix[i][len]<target || matrix[i][0]>target){
                continue;
            }
            else{
                if(matrixx(matrix,target,i)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean matrixx(int[][] matrix,int target,int n){
        int start = 0;
        int end = matrix[n].length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target>matrix[n][mid]){
                start = mid+1;
            }
            else if(target<matrix[n][mid]){
                end = mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}