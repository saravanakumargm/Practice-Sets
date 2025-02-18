public class MergeSortedArray {
        public void mergeArray(int[] num1, int[] num2, int m, int n){
            int[] newArr = new int[m+n];
            for (int i = 0; i < num1.length; i++) {
                for (int j = i+1; j < num1.length; j++) {
                    if(num1[i]>num1[j]){
                        int tmp = num1[i];
                        num1[i] = num1[j];
                        num1[j] = tmp;
                    }
                }
            }
            for (int i = 0; i < num2.length; i++) {
                for (int j = i+1; j < num2.length; j++) {
                    if(num2[i]>num2[j]){
                        int tmp = num2[i];
                        num2[i] = num2[j];
                        num2[j] = tmp;
                    }
                }
            }
            int k=0;
            for (int i = 0; i < num1.length; i++) {
                if(num1[i]!=0){
                    newArr[k] = num1[i];
                    k++;
                }
            }
            for (int i = 0; i < num2.length; i++) {
                if(num2[i]!=0){
                    newArr[k] = num2[i];
                    k++;
                }
            }
            for (int i = 0; i < newArr.length; i++) {
                for (int j = i+1; j < newArr.length; j++) {
                    if(newArr[i]>newArr[j]){
                        int tmp = newArr[i];
                        newArr[i] = newArr[j];
                        newArr[j] = tmp;
                    }
                }
            }
            for(Object c: newArr){
                System.out.print(c);
            }
        }
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1};
        int m=0;
        int n =1;
        System.out.println(b.length);
        MergeSortedArray obj = new MergeSortedArray();
        obj.mergeArray(a,b,m,n);
    }
}
