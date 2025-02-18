public class MatrixAddition {
    int findSum(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num  = num*10 + arr[i];
        }
        System.out.println(num);
        return num;
    }
    public void add(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += findSum(arr[i]);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] arr = {{3,5,4,2},{2,4,5},{4,5,6,7,8},{4,9,2,1},{1,2}};
        new MatrixAddition().add(arr);
    }
}
