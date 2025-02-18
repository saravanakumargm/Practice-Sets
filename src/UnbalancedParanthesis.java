public class UnbalancedParanthesis {
    public void removeUnbalanced(String str){
        int open=0,close=0;
        char[] arr = str.toCharArray();
        for(int start=0,end=arr.length-1; start<arr.length;start++,end--){
            if(arr[start] =='('){
                open++;
            } else if (arr[start] == ')') {
                open--;
            }

            if(arr[end] ==')'){
                close++;
            } else if (arr[end] == '(') {
                close--;
            }

            if(open<0){
                arr[start] = 0;
                open = 0;
            }
            if(close<0){
                arr[end] = 0;
                close=0;
            }
        }
        for(char c : arr){
            if(c!=0) {
                System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        new UnbalancedParanthesis().removeUnbalanced("(((ab))");
    }
}
