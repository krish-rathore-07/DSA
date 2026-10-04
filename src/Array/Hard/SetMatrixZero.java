package Array.Hard;

public class SetMatrixZero {

    public static void setRow(int matrix[][],int row,int colLength){
        for(int i = 0;i<colLength;i++){
            if(matrix[row][i]!=0)
                matrix[row][i]=-1;
        }
    }

    public static void setCol(int matrix[][],int col,int rowLength){
        for(int i = 0;i<rowLength;i++){
            if(matrix[i][col]!=0)
                matrix[i][col]=-1;
        }
    }

    //brute force approach
    public void setZeroesBrute(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean flag = true;
        for(int i= 0;i<n;i++){
            for(int j= 0;j<m;j++){

                if(matrix[i][j]==0){
                    flag = false;
                    setCol(matrix,j,n);
                    setRow(matrix,i,m);
                }
            }
        }
        if(flag) return;
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    // this is the better approach in which we are using extra space of SC - O(n+m)
    public void setZeroesBetter(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        int row[] = new int[n];
        int col[]= new int[m];

        for(int i = 0;i<n;i++){
            for(int j= 0 ;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    // this is the optimal approach in which we are not using any extra space and using TC - O(n*m)
    public void setZeroesOptimal(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        // int row[] = new int[n];
        // int col[]= new int[m];
        int col0 = 1;

        for(int i = 0;i<n;i++){
            for(int j= 0 ;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0)
                        matrix[0][j]=0;
                    else
                        col0=0;
                }
            }
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i= 0 ;i<m;i++) matrix[0][i]=0;
        }
        if(col0==0){
            for(int i= 0;i<n;i++) matrix[i][0]=0;
        }
    }

    void main(){

    }
}
