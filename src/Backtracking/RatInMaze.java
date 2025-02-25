package Backtracking;

public class RatInMaze {
    public static void main(String[] args) {

        int mat[][]={
                {1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1}
        };

        int n= mat.length; // Rows        4
        int m= mat[0].length; // Columns  4

        boolean vis[][] = new boolean[n][m];
        vis[0][0]=true;
        
        RatInAMaze(mat,vis,n,m,0,0,"");
    }

    static boolean isValid(int i,int j, int mat[][],boolean vis[][],int n, int m){
    if(i<n && i>=0 && j<m && j>=0 && mat[i][j]==1 && vis[i][j]==false){
        return true;
    }
    return false;
    }

    //Directions:DLRU
    static void RatInAMaze(int mat[][],boolean vis[][],int n,int m, int i, int j,String path){
    if(i==n-1 && j==m-1){
        System.out.println(path);
        return;
    }

    if(isValid(i+1,j,mat,vis,n,m)){ //Down
        vis[i+1][j]=true;
        RatInAMaze(mat,vis,n,m,i+1,j,path+'D');
        vis[i+1][j]=false;
    }
    if(isValid(i,j-1,mat,vis,n,m)){ //Left
        vis[i][j-1]=true;
        RatInAMaze(mat,vis,n,m,i,j-1,path+'L');
        vis[i][j-1]=false;
    }
    if(isValid(i,j+1,mat,vis,n,m)){ //Right
        vis[i][j+1]=true;
        RatInAMaze(mat,vis,n,m,i,j+1,path+'R');
        vis[i][j+1]=false;
    }
    if(isValid(i-1,j,mat,vis,n,m)){ //Up
        vis[i-1][j]=true;
        RatInAMaze(mat,vis,n,m,i-1,j,path+'U');
        vis[i-1][j]=false;
    }
    }

}
