import java.util.LinkedList;
import java.util.List;

public class SafestPlace {
    public static int size(int[] arr) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                len++;
            }
        }
        return len;
    }

    public static int findSafePosition(int numProcesses, int start, int skip) {
        // Create a list to represent the circular queue
        int[] processes = new int[numProcesses];
        for (int i = 0; i < numProcesses; i++) {
            processes[i] = i + 1;
        }

        // Adjust the start position to 0-based index
        int currentIndex = start - 1;

        // Eliminate processes until only one remains
        int remaining = numProcesses;
        while (remaining > 1) {
            int steps = 0;

            // Find the next valid process to skip
            while (steps < skip) {
                currentIndex = (currentIndex + 1) % numProcesses;
                if (processes[currentIndex] > 0) {
                    steps++;
                }
            }

            // Mark the process as removed
            processes[currentIndex] = -1;
            remaining--;

            // Move to the next valid position
            while (processes[currentIndex] == -1) {
                currentIndex = (currentIndex + 1) % numProcesses;
            }
        }

        // Return the last remaining process
        for (int i = 0; i < processes.length; i++) {
            if (processes[i] > 0) {
                return processes[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numProcesses = 5;
        int startPosition = 3;
        int skip = 2;

        int safePosition = findSafePosition(numProcesses, startPosition, skip);
        System.out.println(safePosition + " will be the safest position");
    }
}
