import java.util.Scanner;
public class SkillRack {
    public static void main(String[] args) {
        String s = "cry";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(i==j || i+j==s.length()-1){
                    System.out.print(s.charAt(j));
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
