public class PrintAllSubsets {
    public static void findSubsets(int[] arr, int target) {
        int[] subset = new int[arr.length];
        findSubsetsHelper(arr, target, 0, subset, 0);
    }

    private static void findSubsetsHelper(int[] arr, int target, int index, int[] subset, int subsetIndex) {
        if (target == 0) {
            printSubset(subset, subsetIndex);
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Include the current element
        subset[subsetIndex] = arr[index];
        findSubsetsHelper(arr, target - arr[index], index + 1, subset, subsetIndex + 1);
        // Exclude the current element
        findSubsetsHelper(arr, target, index + 1, subset, subsetIndex);
    }

    private static void printSubset(int[] subset, int size) {
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            System.out.print(subset[i] + (i<size-1 ? ", " : ""));
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int targetSum = 10;

        System.out.println("Subsets with sum equal to " + targetSum + ":");
        findSubsets(inputArray, targetSum);
    }
}
