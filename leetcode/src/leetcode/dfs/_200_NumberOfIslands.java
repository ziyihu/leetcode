package leetcode.dfs;

public class _200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1') {
                    result++;
                    dfs(grid, i, j);
                }
            }
        }
        return result;
    }
    
    public void dfs(char[][] grid, int r, int c) {
        if(r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c]=='0') return;
        
        if(grid[r][c]== '1') {
            grid[r][c] = '0';
        }
        
        dfs(grid, r-1,c);
        dfs(grid, r+1,c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
    }
}
