public class Balls {
    public void print(int red, int blue){
//        int rows = (red+blue)/2;
//        char start = red>blue ? 'R' : 'B';
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(start + " ");
//            }
//            start = start=='R' ? 'B' : 'R';
//            System.out.println();
//        }
        int high = Math.max(red, blue);
        char highChar = red > blue ? 'R' : 'B';
        int low = Math.min(red,blue);
        char start = (high - low) * (high - low) == red ? 'R' : 'B';

            for (int i = 0; i < (red+blue)/2; i++) {
                if(high==0){
                    break;
                }
                for (int j = 0; j < (red+blue)/2 - i; j++) {
                    System.out.print( " ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(start + " ");
                    if(start==highChar) {
                        high--;
                    }
                }
                start = start=='R' ? 'B' : 'R';
                System.out.println();
            }
    }

    public static void main(String[] args) {
        new Balls().print(4,6);
    }
}
