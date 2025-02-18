public class SumArray {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,1,2,6,7};
        int sum =10,tot=0;
        for (int i = 0; i < arr.length; i++) {
                tot += arr[i];
                if(tot==sum){
                    System.out.print((i+1)-i + " ");
                    System.out.print(i+1);
                }

        }
    }
}
