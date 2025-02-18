public class FindLargestNumber {
    public int largest(int s, int d){
        int[] res = new int[d];
        for (int i = 0; i < d; i++) {
            if(s>=9){
                res[i] = 9;
                s-=9;
            }else{
                res[i] = s;
                s = 0;
            }
        }
        int num = 0;
        for(int i : res){
            System.out.print(i + "");
        }
        System.out.println();
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new FindLargestNumber().largest(20,3));
    }
}
