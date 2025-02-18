public class AdjacentZero {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,1,1},{1,1,1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==1){
                    if(i-1>=0)
                        arr[i-1][j] = 0;
                    if(i+1<arr.length)
                        arr[i+1][j] =0;
                    if(j-1>=0)
                        arr[i][j-1] = 0;
                    if(j+1<arr[0].length)
                        arr[i][j+1] = 0;
                }
            }

        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[j][k] +" ");
            }
            System.out.println();
        }
    }
}
