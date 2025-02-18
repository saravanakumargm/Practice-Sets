import java.util.Scanner;
public class AlternateSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int pos=0;pos<arr.length;pos+=2){
            int temp = arr[arr.length-1];
            for (int i = arr.length-1; i >pos ; i--) {
                arr[i] = arr[i-1];
            }
            arr[pos] = temp;
        }
        for(int i :arr){
            System.out.print(i + " ");
        }
    }
}
//12345
//51