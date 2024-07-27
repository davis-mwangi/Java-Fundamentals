package graphs;

public class NoOfIslands {
    /*
 [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]




     */

    public static int solution(char [] [] grid){
        int rows =  grid.length;
        int cols = grid[0].length;
        boolean [][] visited =  new boolean[rows][cols];
        int islands = 0;
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(!visited[r][c] &&  grid[r][c] == '1'){
                    dfs(grid, r, c, visited);
                    islands += 1;
                }
            }
        }
        return islands;
    }

    public static void dfs(char [][] grid, int r, int c, boolean[][]visited ){
        if(r < 0 || c < 0 || r > grid.length || c > grid[0].length || visited[r][c] || grid[r][c] == '0'){
            return;
        }
        visited[r][c] = true;
        dfs(grid, r, c + 1 , visited);
        dfs(grid, r, c - 1 , visited);
        dfs(grid,  r - 1, c , visited);
        dfs(grid,  r + 1, c , visited);
    }
}
