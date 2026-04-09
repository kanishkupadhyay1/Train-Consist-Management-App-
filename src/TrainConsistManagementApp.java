import java.util.*;


class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class Bogie {
    String type;
    String cargo;


    // Constructor for goods bogie (no capacity validation needed)
    Bogie(String type) {
        this.type = type;

    }


    @Override
    public String toString() {

            return type + " -> Cargo: " + (cargo != null ? cargo : "None");

    }

    public void assignCargo(String cargo) {
        try {
            // Safety validation
            if (this.type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo! Petroleum cannot be carried in Rectangular bogie.");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for " + type + " bogie.");
        }
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {


        List<Bogie> bogies = Arrays.asList(
                new Bogie("Rectangular"),
                new Bogie("Cylindrical")
        );

// Runtime cargo assignment
        bogies.get(0).assignCargo("Petroleum");
        bogies.get(1).assignCargo("Petroleum");




        System.out.println("\nGoods Bogies in Train:");
        bogies.forEach(System.out::println);


    }
}



