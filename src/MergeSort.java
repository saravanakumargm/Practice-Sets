
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8};
        int[] res = mergeSort(arr);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int arrIndex = 0;
        int[] half = new int[(arr.length)/2];
        for (int i = 0; i < half.length; i++) {
            half[i] = arr[arrIndex++];
        }
        int len = 0;
        if(arr.length%2==0){
            len = half.length;
        }else{
            len = half.length+1;
        }
        int[] nextHalf = new int[len];
        for (int i = 0; i < nextHalf.length; i++) {
            nextHalf[i]= arr[arrIndex++];
        }
        return merge(mergeSort(half),mergeSort(nextHalf));
    }

    private static int[] merge(int[] half, int[] nextHalf) {
        int[] res = new int[half.length+nextHalf.length];
        int i = 0;
        int j = 0;
        int ind = 0;
        while (i<half.length && j<nextHalf.length){
            if(half[i]<nextHalf[j]){
                res[ind++] = half[i];
                i++;
            }else{
                res[ind++] = nextHalf[j];
                j++;
            }
        }
        while (i<half.length){
            res[ind++] = half[i++];
        }
        while (j<nextHalf.length){
            res[ind++] = nextHalf[j++];
        }
        return res;
    }
}
