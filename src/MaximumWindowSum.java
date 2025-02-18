public class MaximumWindowSum {
    public int max(int[] arr){
        int res = 0;
        int first = 0;
        int sum =0 ;
        int second = 1;
        while (first<arr.length &&second<arr.length){
            sum = arr[first] +  arr[second];
            if(sum<0){
                first = second;
                sum = 0;
            }else{
                res =  Math.max(res,second - first);
                System.out.println(res);
            }
            second++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, -8, 7, -6, -5};
        System.out.println(new MaximumWindowSum().max(arr));
    }
}
