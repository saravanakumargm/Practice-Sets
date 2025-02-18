import java.util.Scanner;
public class RecDIv {
    public int isPalindrome(int num){
        int tmp = num;
        int num1=0;
        while(tmp>0){
            int ld = tmp%10;
            num1 = num1*10+ld;
            tmp/=10;
        }
        if(num1==num){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();//34
        int newNum=0;
        RecDIv obj = new RecDIv();
        while(num>0){
            int ld = num%10;
            newNum = newNum*10+ld;
            num/=10;
        }
      //  System.out.print(new RecDIv().isPalindrome(newNum));
        int val=0;
        int sum = num+newNum;
        int tot=0;
        int res = obj.isPalindrome(sum);
        while(res==1){
            int tmp = sum;
            while(tmp>0){
                int ld = tmp%10;
                tot+=ld;
                tmp/=10;
            }
            System.out.println("tot = " + tot);

            if(obj.isPalindrome(tot)==1){
                System.out.println(tot + "is palindrome");
                 break;
            }
            res= obj.isPalindrome(tot);

        }
        if(obj.isPalindrome(res)==1){
            System.out.println("Palindrome");
        }

    }
}
