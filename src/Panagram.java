public class Panagram {
    public void isPanagram(String str){
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                char c = (char) (str.charAt(i)+32);
                arr[c-97] = 1;
            }
            else
                arr[str.charAt(i)-97] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        new Panagram().isPanagram("abcdefghijklmnopqrstuvWxyz");
    }
}
