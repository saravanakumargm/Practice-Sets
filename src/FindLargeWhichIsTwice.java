public class FindLargeWhichIsTwice {
    public void find(int[] arr){
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(max<2*arr[i] && arr[i]!=max) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {3,9,5,0};
        new FindLargeWhichIsTwice().find(arr);
    }
}
