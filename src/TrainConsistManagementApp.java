import java.util.*;


class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String type;
    String cargo;
    int capacity;

    // Constructor for goods bogie (no capacity validation needed)
    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Constructor for passenger bogie (with validation)
    Bogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity! Must be > 0");
        }
        this.type = type;
        this.capacity = capacity;
        this.cargo = "Passengers";
    }

    @Override
    public String toString() {
        if ("Passengers".equals(cargo)){
            return type + " -> Capacity: " + capacity;
        }
        return type + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {


        List<Bogie> bogies = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Open", "Coal"),
                new Bogie("Box", "Grain"),
                new Bogie("Cylindrical", "Coal")
        );

        try {
            Bogie passengerBogie = new Bogie("Passenger", -50); // invalid capacity
            System.out.println(passengerBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("\nGoods Bogies in Train:");
        bogies.forEach(System.out::println);


    }
}



