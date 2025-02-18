import java.util.Stack;

public class ValidMathExpression {
    public static boolean isValid(String exp){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char curr = exp.charAt(i);
            if(curr=='('){
                stack.push(curr);
            } else if (curr==')') {
                if(stack.isEmpty() || stack.peek()!='('){
                    return false;
                }
                stack.pop();
            } else if (i>0 && (curr =='+' || curr == '*')) {
                char prev = exp.charAt(i-1);
                char next = exp.charAt(i+1);
                if(prev=='(' ||prev=='+' ||prev=='*' || prev==')' || next==')' || next=='(' || next=='+' || next=='*'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ValidMathExpression.isValid("(a+b)"));
    }
}
