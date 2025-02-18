public class knight {
    public void findValid(int[][] arr){
        int[] dx = {-2,-1, 1, 2,2,1,-1,-2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==1){
                    for (int k = 0; k < 8; k++) {
                        int ni = i+dx[k];
                        int ny = j + dy[k];
                        if(isValid(ni,ny) && arr[ni][ny]==1){
                            System.out.println("Invalid");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Valid");
    }

    private boolean isValid(int x, int y) {
        return x>=0 && x<5 && y>=0 && y<5;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0, 0, 0,},{0, 0, 0, 0,1},{1, 0, 0, 0, 0},{0, 0, 0,1, 0},{1, 0, 0, 0, 1}};
        new knight().findValid(arr);
    }
}
