package Week_1.Day_4;

import java.util.*;

public class ReshapeMatrix {
     public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;

        if (m * n != r * c) return mat;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(mat[i][j]);
            }
        }

        int[][] ans = new int[r][c];
        int idx = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = list.get(idx++);
            }
        }
        
        return ans;
    }
}
