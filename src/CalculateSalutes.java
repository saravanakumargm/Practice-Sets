public class CalculateSalutes {
    public static int noOfSalutes(String s){
        int salutes = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)=='>'){
                if(s.charAt(i-1)=='<'){
                    salutes++;
                }
            }else{
                if(s.charAt(i-1) == '>'){
                    salutes++;
                }
            }
        }
        return salutes;
    }

    public static void main(String[] args) {
        System.out.println( noOfSalutes("><><>"));
    }
}
