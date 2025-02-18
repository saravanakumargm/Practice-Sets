public class FindOccAndPrintLowHigh {
    boolean isPresent(char[] arr,char c){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==c)
                return true;
        }
        return false;
    }
    public void find(String s, String s2){
        int lowIndex = Integer.MAX_VALUE;
        int highIndex = 0;
        char[] chars = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            chars[i] = s2.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            if(isPresent(chars,s.charAt(i))){
                chars = deleteC(chars,s.charAt(i));
                if(i<lowIndex){
                    lowIndex =  i;
                }
                if(i>highIndex){
                    highIndex = i;
                }
            }
        }
        System.out.println(s.substring(lowIndex,highIndex+1));
    }

    private char[] deleteC(char[] chars, char c) {
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==c){
                chars[i] = '0';
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        new FindOccAndPrintLowHigh().find("zohocorporation","port");
    }
}
