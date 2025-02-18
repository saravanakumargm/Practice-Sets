public class GCDOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        System.out.println(str1 + " " + str2);
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2,str1);
        }else if(!str1.startsWith(str2)){
            return "";
        }else if(str2.isEmpty()){
            System.out.println("returned");
            return str1;
        }else{
            System.out.println("- "+str1 + " " + str2);
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
    }

    public static void main(String[] args) {
        System.out.println(new GCDOfStrings().gcdOfStrings("ABCABC","ABC"));
        System.out.println("HEllo".substring(3));
    }
}
