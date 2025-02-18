public class RemoveDuplicates {
    public String remove(String s){
        if(s.length()==1){
            return s;
        }
        int left = 0;
        int right = 1;
        while(right<s.length() && s.length()>1){
            if(s.charAt(left)==s.charAt(right)){
                s = s.substring(0,left) + s.substring(right+1);
                if(s.length()==1){
                    System.out.println(s);
                    break;
                }
                remove(s);
            }
            right++;
            left++;
        }
        return "";
    }

    public static void main(String[] args) {
        new RemoveDuplicates().remove("KCCAABB");
    }
}
