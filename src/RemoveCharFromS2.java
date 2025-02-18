public class RemoveCharFromS2 {
    public void remove(String s1, String s2){
        for (int i = 0; i < s1.length(); i++) {
            if(!contains(s1.charAt(i),s2)){
                System.out.print(s1.charAt(i));
            }
        }
    }

    private boolean contains(char c, String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new RemoveCharFromS2().remove("expErlence","En");
    }
}
