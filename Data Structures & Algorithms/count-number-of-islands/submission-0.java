class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] =='1'){
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        grid[i][j]='0';
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int[] d:dir){
                int ni = cur[0]+d[0];
                int nj = cur[1]+d[1];

                if (ni >= 0 && nj >= 0 && ni < grid.length && nj < grid[0].length && grid[ni][nj] == '1') {
                    q.add(new int[]{ni, nj});
                    grid[ni][nj] = '0';
                }
            }
        }
    }
}
