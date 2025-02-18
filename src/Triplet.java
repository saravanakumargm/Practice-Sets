public class Triplet {
    public static boolean validTriplet(int[] nums){
       int small = Integer.MAX_VALUE;
       int large  = Integer.MAX_VALUE;
       for(int num : nums){
           if(num<small){
               small = num;
           } else if (num<=large) {
               large = num;
           }else{
               return true;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,0,4,6};
        System.out.println(validTriplet(arr));
    }
}
