public class PasswordStrength {
    public void strength(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                count = 1;
            } else if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                count = 1;
            } else if ((s.charAt(i)>='A' && s.charAt(i)<='Z') && (s.charAt(i)>='a' && s.charAt(i)<='z')) {
                count  =2;
            } else if ((s.charAt(i)>='A' && s.charAt(i)<='Z') && (s.charAt(i)>='a' && s.charAt(i)<='z') && s.length()>7) {
                count = 2;
            }else if((s.charAt(i)>='A' && s.charAt(i)<='Z') && (s.charAt(i)>='a' && s.charAt(i)<='z') && s.length()>7 && s.charAt(i)>='0' && s.charAt(i)<='9'){
                count = 3;
            }
        }
        if(count==1){
            System.out.println("weak");
        } else if (count==2) {
            System.out.println("medium");
        }else{
            System.out.println("strong");
        }
    }

    public static void main(String[] args) {
        new PasswordStrength().strength("QwertY123");
    }
}
