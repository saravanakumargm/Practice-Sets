public class RepeatedWords {
    public static void repeat(String[] arr){
        String temp = "";
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j)>='0' && arr[i].charAt(j)<='9'){
                    num = Integer.parseInt(String.valueOf(arr[i].charAt(j)-'0'));
                    temp = arr[i].substring(0,j);
                    for (int k = 0; k < num; k++) {
                        System.out.print(temp);
                    }
                }
            }
            temp = "";
            System.out.print( " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"hello0", "world2"};
        repeat(arr);
    }
}
