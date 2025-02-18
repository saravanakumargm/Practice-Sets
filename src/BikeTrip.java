import java.util.Arrays;

public class BikeTrip {
    public void minRide(int[] persons, int maxWeight){
        Arrays.sort(persons);
        int i =0;
        int j = persons.length-1;
        int trips = 0;

        while (i <= j) {
            if (persons[i] + persons[j] <= maxWeight) {
                i++;
            }
            j--;
            trips++;
        }
        System.out.println(trips);
    }

    public static void main(String[] args) {
        int[] arr = {50, 75, 80, 60, 55};
        new BikeTrip().minRide(arr,130);
    }
}
