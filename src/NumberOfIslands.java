import org.w3c.dom.ls.LSOutput;

public class NumberOfIslands {
    public int find(int[][] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    ans+=1;
                    dfs(arr,i,j);
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] arr, int i, int j) {
        if(i<0 || i>=arr.length || j<0 || j>arr[0].length || arr[i][j]==0){
            return;
        }
        arr[i][j] = 0;
        dfs(arr,i,j+1);
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, -1, -1,  1},{ -1,  1, -1,  1,},{ -1, -1,  1, -1,},{ -1, -1, -1,  1}};
        System.out.println(new NumberOfIslands().find(arr));
    }

}
