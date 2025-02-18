import java.util.Stack;

public class ReplaceNextHigh {
    public static void printNextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
                System.out.print(arr[i] + " ");
            }
            stack.push(i);
        }

        // Remaining elements in the stack have no greater element
        while (!stack.isEmpty()) {
            stack.pop();
            System.out.print(-1 + " ");
        }

    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 90, 77, 54};
        printNextGreaterElements(arr);
    }
}
