public class ReplaceNextValid {
    public void modify(int[] arr){
        int zeroCount = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                arr[i] = arr[i]*2;
                arr[i+1] = 0;
            }
            if(arr[i]==0){
                zeroCount++;
            }
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[ind++] = arr[i];
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            arr[ind++] = 0;
        }
        System.out.println();
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        new ReplaceNextValid().modify(arr);
    }
}
