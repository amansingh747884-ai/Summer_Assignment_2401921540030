package Week_1.Day_4;

public class Diagonalsum {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]+mat[i][n-1-i];
            if(i==n-1-i)
            sum-=mat[i][i];
        }
        return sum;
    }
}

