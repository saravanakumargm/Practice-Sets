public class ZohoPatternJan {
    public void print(int n){
        String s = "zoho";
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(i+j==n+1 || i==j){
                    System.out.print(arr[i] + "\t");
                } else if (i == (n+1)/2) {
                    System.out.print(arr[j] + "\t");
                } else if (j==(n+1)/2) {
                    System.out.print(arr[i] + "\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new ZohoPatternJan().print(7);
    }
}
