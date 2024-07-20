class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int [][]arr = new int[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(rowSum[i] < colSum[j]){
                    arr[i][j] = rowSum[i];
                }
                else if(rowSum[i] > colSum[j]){
                    arr[i][j] = colSum[j];
                }
                else{
                    arr[i][j] = colSum[j];
                }
                rowSum[i] -= arr[i][j];
                colSum[j] -= arr[i][j];
            }
        }
        return arr;
    }
}