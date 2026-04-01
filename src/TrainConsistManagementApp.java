import java.util.*;
import java.util.stream.Collectors;

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

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 80));

        System.out.println("Bogies in the Train:");
        bogies.forEach(System.out::println);

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract numeric capacity
                .reduce(0, Integer::sum);   // sum all capacities

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
    }
}

