public class SumOfDiagonals {
    public static void sum(int[][] arr){
        int sum = 0;
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        SumOfDiagonals.sum(arr);
    }
}
