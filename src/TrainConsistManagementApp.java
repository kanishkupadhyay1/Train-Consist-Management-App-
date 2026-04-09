import java.util.*;


public class TrainConsistManagementApp {
    public static boolean linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return true; // match found
            }
        }
        return false; // not found
    }


    public static void main(String[] args) {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();


        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found in the train.");
        } else {
            System.out.println("Bogie ID not found.");
        }







    }
}



