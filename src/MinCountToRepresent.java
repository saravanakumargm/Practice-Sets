public class MinCountToRepresent {
    public void minNum(int num){
        //0,1,10,11
        int last = num%10;
        int res = 1;
        int count=0;
        for (int i = 0; i < last; i++) {
            res+=11;
            count++;
        }
        if(res==num){
            System.out.println(count);
        } else if (num-res<10) {
            while (res==num){
                res+=1;
                count++;
            }
        }else{
            while (res == num){
                res+=10;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new MinCountToRepresent().minNum(45);
    }
}
