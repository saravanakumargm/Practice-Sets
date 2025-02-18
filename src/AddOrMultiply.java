public class AddOrMultiply {
    public static int maxi(int n){
        int add = 0;
        int mul = 1;
        while (n>0){
            int last = n%10;
            add+=last;
            mul*=last;
            n/=10;
        }
        return Math.max(add, mul);
    }
    public void find(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(maxi(arr[i]));
        }
    }

    public static void main(String[] args) {
        int[] arr = {120,24,71,10,59};
        new AddOrMultiply().find(arr);
    }
}

