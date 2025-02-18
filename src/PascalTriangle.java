import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print( " " + factorial(i) / (factorial(i-j) * factorial(j)));
            }
            System.out.println();
        }
    }

    private int factorial(int i) {
        if(i==0) return 1;
        return i * factorial(i-1);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        result.add(prev);
        for(int i = 2; i <= numRows; i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j = 0; j < prev.size()-1; j++){
                cur.add(prev.get(j) + prev.get(j+1));
            }
            cur.add(1);
            result.add(cur);
            prev = cur;
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new PascalTriangle().generate(5);
//        for(List<Integer> list : ans){
//            System.out.println(list);
//        }
        PascalTriangle p = new PascalTriangle();
        p.print(7);
    }
}
