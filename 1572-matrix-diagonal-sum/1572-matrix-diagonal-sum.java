class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, i=0;
        int n = mat.length;
        while(i<n){
            sum+=mat[i][i];
            sum+=mat[n-1-i][i];
            i++;
        }
        return n%2==0 ? sum : sum - mat[n/2][n/2];
    }
}