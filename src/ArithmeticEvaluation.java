import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArithmeticEvaluation {
    public int evaluate(String exp){
        LinkedList<Integer> stack = new LinkedList<>();

        // Scan all characters one by one
        for (char c : exp.toCharArray()) {
            // If the scanned character is an operand
            // (number here), push it to the stack.
            if (Character.isDigit(c))
                stack.offer(c - '0');

                //  If the scanned character is an operator, pop
                //  two elements from stack apply the operator
            else {
                int val1 = stack.poll();
                int val2 = stack.poll();

                switch (c) {
                    case '+':
                        stack.offerFirst(val2 + val1);
                        break;
                    case '-':
                        stack.offerFirst(val1 - val2);
                        break;
                    case '/':
                        stack.offerFirst(val1 / val2);
                        break;
                    case '*':
                        stack.offerFirst(val1 * val2);
                        break;
                }
            }
        }
        return stack.poll();
    }

    public static void main(String[] args) {
        System.out.println(new ArithmeticEvaluation().evaluate("12345+-*/"));
    }
}
