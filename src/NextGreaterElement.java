//import java.util.Stack;
//
//public class NextGreaterElement {
//    public void nextGreater(int[] arr){
//        int start = 0;
//        int end = 1;
//        int great = arr[end];
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            while (!stack.isEmpty() && stack.peek()<=arr[i]){
//                stack.pop();
//            }
//            if(stack.isEmpty()){
//                arr[i] = arr[i];
//            }else{
//                arr[i] = stack.peek();
//            }
//            stack.push(arr[i]);
//        }
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = { 2, 1, 8, 7, 6, 5 };
//        new NextGreaterElement().nextGreater(arr);
//    }
//}

import java.util.*;

public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array in reverse
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are smaller than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If the stack is empty, no greater element exists for the current element
            result[i] = stack.isEmpty() ? arr[i] : stack.pop();

            // Push the current element onto the stack
            //1 2 3
            //4 5 6
            //7 8 9
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {2, 1, -8, 7, 6, -5};
        int[] output = findNextGreaterElements(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(output));
    }
}
