public class MakeAnagrams {
    public static int makeAnagram(String s1, String s2){
        int count = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            count+=Math.abs(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("abcd","bchjh"));
    }
}
