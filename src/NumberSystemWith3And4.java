public class NumberSystemWith3And4 {
    public static void print(int n){
        String[] arr = new String[n+1];
        int size = 1, ele = 1;
        arr[0] = "";
        while (size<=n){
            for(int i=0;i<ele && (size+i)<=n;i++){
                arr[size + i] = "3" + arr[size - ele +i];
            }
            for(int i=0;i<ele && (size+ele+i)<=n;i++){
                arr[size + ele + i] = "4" + arr[size-ele+i];
            }
            ele = ele<<1;
            size = size+ele;
        }
        System.out.print(arr[n] + " ");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            NumberSystemWith3And4.print(i);
        }
    }
}
