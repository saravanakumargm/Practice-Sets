import java.util.HashMap;

public class WorkSpace {
    public static void getLucky(String str, int k){
        int res = 0;
        for(char c : str.toCharArray()){
            int num =  c-'a'+1;
            if(num>10){
                num = splitNum(num);
            }
            res+=num;
        }
        if(k>1){
            res = splitNum(res);
            k--;
        }
        System.out.println(res);
    }

    private static int splitNum(int res) {
        int sum = 0;
        while(res>0){
            sum+=res%10;
            res/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        getLucky("leetcode",2);
        System.out.println('z'- 'a');
    }

}
