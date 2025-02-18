public class AddRepeated {
    int zeroCount = 0;
    public void repeatAdd(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==0)
                zeroCount++;
            if(arr[i]!=0){
                if(arr[i]==arr[i+1]){
                    System.out.print(arr[i] + arr[i+1] + " ");
                    arr[i+1] = 0;
                }else{
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.print(arr[arr.length-1] + " ");
        int len = arr.length - zeroCount;
        for (int i = 0; i < zeroCount; i++) {
            System.out.print(0 + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 8};
        new AddRepeated().repeatAdd(arr);
    }
}
