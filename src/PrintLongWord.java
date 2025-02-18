public class PrintLongWord {
    public void printLongWord(String s){
        int max = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        int be = 0,en=0;
        while (end<s.length()){
            if(s.charAt(end)==' ' || end == s.length()-1){

                if(count > max){
                    max = count;
                    be = start;
                    en = end;
                }
                start++;
                end = start;
                count=0;
            }
            count++;
            end++;
        }
        for(int i = be;i<=en;i++){
            System.out.print(s.charAt(i));
        }

    }

    public static void main(String[] args) {
        new PrintLongWord().printLongWord("i come by car");
    }
}
