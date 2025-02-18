import java.util.Stack;

public class NestedEncodedStrings {
    public static void decode(String s){
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        String currentString = "";
        int currentNumber = 0;//"3[a2[bc]]"
        for (char c  : s.toCharArray()) {
            if(Character.isDigit(c)){
                currentNumber = currentNumber*10 +(c-'0');
            }else if(c=='['){
                numberStack.push(currentNumber);
                stringStack.push(currentString);
                currentNumber = 0;
                currentString = "";
            }else if(c==']'){
                int times = numberStack.pop();
                String temp  = stringStack.pop();
                for (int i = 0; i < times; i++) {
                    temp+=currentString;
                }
                currentString = temp;
            }else{
                currentString+=c;
            }
        }
        System.out.println(currentString);
    }

    public static void main(String[] args) {
        decode("2[abc]3[cd]ef");
    }
}
