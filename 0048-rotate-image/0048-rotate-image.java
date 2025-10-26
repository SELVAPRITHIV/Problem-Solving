class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            lst.add(new ArrayList<>());
            for(int j=matrix.length-1;j>=0;j--){
                lst.get(i).add(matrix[j][i]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1;j>=0;j--){
                matrix[i][j] = lst.get(i).get(j);
            }
        }
    }
}