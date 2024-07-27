package graphs;

/*
[
 [0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]
 ]



 */

import java.util.Comparator;

public class MaximumAreaOfISland {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                new int[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.println(maxAreaOfIsland(grid));
    }

    public  static int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int[] area = new int[1];
                if (!visited[r][c] && grid[r][c] == 1) {
                    dfs(grid, r, c, visited, area);
                    maxArea = Math.max(area[0], maxArea);
                }
            }
        }
        return maxArea;
    }

    public static void dfs(int[][] grid, int r, int c, boolean[][] visited, int[] area) {
        // Check Bounds
        if (  r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || visited[r][c] || grid[r][c] == 0) {
            return;
        }
        area[0] += 1;
        visited[r][c] = true;

        dfs(grid, r, c + 1, visited, area);
        dfs(grid, r, c - 1, visited, area);
        dfs(grid, r + 1, c, visited, area);
        dfs(grid, r - 1, c, visited, area);
    }

    public class Mycomparator implements Comparator<int[]>{

        @Override
        public int compare(int[] o1, int[] o2) {
            return 0;
        }
    }
}
