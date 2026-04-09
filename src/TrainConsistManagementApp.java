import java.util.*;


public class TrainConsistManagementApp {
    public static boolean binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return true; // found
            } else if (result > 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieIds));

// Sort first (handles unsorted input case)
        Arrays.sort(bogieIds);
        Scanner sc = new Scanner(System.in);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearch(bogieIds, key);


        if (found) {
            System.out.println("Bogie ID found in the train.");
        } else {
            System.out.println("Bogie ID not found.");
        }







    }
}



