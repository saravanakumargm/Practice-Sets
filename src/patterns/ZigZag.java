package patterns;

public class ZigZag {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int i =0 ;
        int m = arr.length;
        int n = arr[0].length;
        int[] res = new int[m*n];
        int row = 0;
        int col = 0;
        boolean up = true;
        while (row<m && col<n){
            if(up){
                while (row>0 && col<n-1){
                    res[i++] = arr[row][col];
                    row--;
                    col++;
                }
                res[i++] = arr[row][col];
                if(col==n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while (col>0 && row<m-1){
                    res[i++] = arr[row][col];
                    row++;
                    col--;
                }
                res[i++] = arr[row][col];
                if(row==m-1){
                    col++;
                }else{
                    row++;
                }
            }
            up = !up;
        }
        for(int k : res){
            System.out.print(k + " ");
        }
    }
}
