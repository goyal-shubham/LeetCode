package DFS;

/**
 * Created by shubham.goyal on 3/7/17.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;

        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    DFS(i, j , grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void DFS(int i , int j, char[][] grid) {
        if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        DFS(i + 1, j , grid);
        DFS(i, j + 1 , grid);
        DFS(i, j - 1 , grid);
        DFS(i - 1, j , grid);

    }
}
