public class RemoveDuplicateFromTwoArrays {
    public void sort(int[] arr1, int[] arr2){
        int i = 0, j = 0,ind =0 ;
        int[] res = new int[arr1.length + arr2.length];
        while (i<arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                res[ind++] = arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                res[ind++] = arr2[j];
                j++;
            }else{
                res[ind++] = arr1[i];
                i++;
                j++;
            }
        }
        while (i<arr1.length){
            res[ind++] = arr1[i];
            i++;
        }
        while (j<arr1.length){
            res[ind++] = arr2[j];
            j++;
        }
        for(int k : res){
            if(k!=0)
                System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {3,5,7,8,10};
        new RemoveDuplicateFromTwoArrays().sort(arr1,arr2);
    }
}
