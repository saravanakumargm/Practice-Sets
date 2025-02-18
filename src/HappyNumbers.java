import java.util.HashSet;

public class HappyNumbers {
    public static void printHappyNumbers(int start, int end){
        for (int i = start; i <= end; i++) {
            if(isHappyNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isHappyNumber(int i) {

        HashSet<Integer> set = new HashSet<>();
        while (true){
            i = squared(i);
            if(i==1){
                return true;
            }
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
    }

    private static int squared(int i) {
        int num = 0;
        while (i>0){
            int last = i%10;
            num+=last*last;
            i/=10;
        }
        return num;
    }

    public static void main(String[] args) {
         printHappyNumbers(1,20);
    }

}
