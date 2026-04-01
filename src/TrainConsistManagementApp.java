import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Bogie {
    String name;
    int capacity;


    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;

    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Train ID (format TRN-1234): ");
        String trainID = sc.nextLine();

        System.out.print("Enter Cargo Code (format PET-XX): ");
        String cargoCode = sc.nextLine();

// Define regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

// Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

// Validate
        if(trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format!");
        }

        if(cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format!");
        }
    }
}

