public class SortExpression {
    public void sort(String[] expressions){
        int[] res = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            res[i] = evaluateExp(expressions[i]);
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if(res[i]<res[j]){
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;

                    String tmp = expressions[i];
                    expressions[i] = expressions[j];
                    expressions[j] = tmp;
                }
            }
        }
        for(String s : expressions){
            System.out.println(s);
        }

    }

    private int evaluateExp(String expression) {
        if (expression.matches("\\d+")) { // Simple number
            return Integer.parseInt(expression);
        }

        if (expression.contains("^")) { // Exponentiation
            int lastIndex = expression.lastIndexOf("^");
            String left = expression.substring(0, lastIndex);
            String right = expression.substring(lastIndex + 1);
            int base = evaluateExp(left);
            int exponent = evaluateExp(right); // Evaluate the exponent first (right-associative)
            return (int) Math.pow(base, exponent);
        } else if (expression.contains("*")) { // Multiplication
            String[] tokens = expression.split("\\*");
            return Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[1]);
        }

        throw new IllegalArgumentException("Unsupported expression: " + expression);
    }

    public static void main(String[] args) {
        String[] exp = {"2*3","3*1","2^2^2","35"};
        new SortExpression().sort(exp);
    }
}
