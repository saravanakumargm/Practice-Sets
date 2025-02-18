public class PairQns {
//    public int zoho(int[] nums) {
//        Pair<Integer, Boolean> a = new Pair<>(-1, false);
//        Pair<Integer, Boolean> b = new Pair<>(-1, false);
//        Pair<Integer, Boolean> c = new Pair<>(-1, false);
//        for (int num : nums) {
//            if (a.getValue() && a.getKey() == num || b.getValue() && b.getKey() == num || c.getValue() && c.getKey() == num) {
//                continue;
//            }
//            if (!a.getValue() || a.getKey() <= num) {
//                c = b;
//                b = a;
//                a = new Pair<>(num, true);
//            } else if (!b.getValue() || b.getKey() <= num) {
//                c = b;
//                b = new Pair<>(num, true);
//            } else if (!c.getValue() || c.getKey() <= num) {
//                c = new Pair<>(num, true);
//            }
//
//        }
//        if (!c.getValue()) {
//            return a.getKey();
//        }
//        return c.getKey();
//    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        //System.out.println(new PairQns().zoho(arr));
    }
}
