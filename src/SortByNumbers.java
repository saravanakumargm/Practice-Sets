public class SortByNumbers {
    public static void sort(String[] list){
        String[]  res = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            String temp = list[i];
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j)>='0' && temp.charAt(j)<='9'){
                    res[temp.charAt(j)-'0' - 1] = list[i].substring(0,j) + list[i].substring(j+1,list[i].length());
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"is2", "a3", "Th1is"};
        sort(arr);
    }
}
