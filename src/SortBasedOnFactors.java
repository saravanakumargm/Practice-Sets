public class SortBasedOnFactors {
    public int noOfFactors(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0)
                count++;
        }
        return count;
    }
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(noOfFactors(arr[i]) < noOfFactors(arr[j])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {14,4,20};
        new SortBasedOnFactors().sort(arr);
    }
}
