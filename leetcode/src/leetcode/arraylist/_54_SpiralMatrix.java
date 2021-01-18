package leetcode.arraylist;

public class _54_SpiralMatrix {
    // create the answer list
    List ans = new ArrayList();
    if (matrix.length == 0) return ans;
    int r1 = 0, r2 = matrix.length - 1;
    int c1 = 0, c2 = matrix[0].length - 1;
    while (r1 <= r2 && c1 <= c2) {
        // add the first line swap from left to right
        for (int c = c1; c <= c2; c++) 
            ans.add(matrix[r1][c]);
        // add the second line swap from top to bottom
        for (int r = r1 + 1; r <= r2; r++) 
            ans.add(matrix[r][c2]);
        // check if we continue or not
        if (r1 < r2 && c1 < c2) {
            // add the third line swap from right to left
            for (int c = c2 - 1; c > c1; c--) 
                ans.add(matrix[r2][c]);
            // add the fourth line swap from bottom to top
            for (int r = r2; r > r1; r--) 
                ans.add(matrix[r][c1]);
        }
        // circle become smaller size by 1. row start +1, row end -1, col start +1, col end -1
        r1++;
        r2--;
        c1++;
        c2--;
    }
    return ans;
}
