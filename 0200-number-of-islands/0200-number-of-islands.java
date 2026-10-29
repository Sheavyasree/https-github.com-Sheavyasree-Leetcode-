class Solution {
    public int numIslands(char[][] grid) {
      int count =  0;
      int m = grid.length;
      int n = grid[0].length;
      for(int i =0;i<grid.length;i++)
      {
        for(int j = 0;j<grid[i].length;j++)
        {
            if(grid[i][j]=='1')
            {
                count +=1;
                dfs(i,j,grid);
            }
        }
      } 
      return count; 
    }
    public static void dfs(int i,int j,char[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>= m || j<0  || j>=n)
        {
            return;
        }
        if(grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
}