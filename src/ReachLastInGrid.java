public class ReachLastInGrid {

    private boolean canReach(int[][] arr, int row, int col, int n){
        if(row==n-1 && col==n-1 && arr[row][col]==1){
            return true;
        }
        if(row>=n || col>=n || arr[row][col]==0){
            return false;
        }

        return canReach(arr,row+1,col,n) || canReach(arr,row,col+1,n);
    }
    public static void main(String[] args) {
        int[][] arr= {{1,0,1,0,0},{1,1,1,1,1},{0,0,0,1,0},{1,0,1,1,1},{0,1,1,0,1}};
        System.out.println(new ReachLastInGrid().canReach(arr,0,0,5));
    }
}
