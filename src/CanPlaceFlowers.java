public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n>0; i+=2) {
            if(flowerbed[i]==0){
                boolean prev = (i==0 || flowerbed[i-1]==0);
                boolean next = (i==flowerbed.length-1 || flowerbed[i+1]==0);
                if (prev && next){
                    System.out.println(i);
                    flowerbed[i]=1;
                    n--;
                    i++;
                }
            }
        }
        System.out.println(n);
        return n<=0;
    }

    public static void main(String[] args) {
        int[] flowers = {1,0,0,0,0,0,1};
        System.out.println(canPlaceFlowers(flowers,2));
    }
}
