import java.util.*;

public class TrainConsistManagementApp {


    public static void main(String[] args){
        System.out.println("========================================================");
        System.out.println("===UC5: Preserve Insertion Order of Bogies (LinkedHashSet)===");
        System.out.println("========================================================\n");
        Set<String> trainConsist = new LinkedHashSet<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");

        trainConsist.add("Cargo");
        trainConsist.add("Guard");





        System.out.println("Final Train Formation:\n"+trainConsist);

        System.out.println("\nNote: LinkedHashSet preserves insertion order and remove duplicates automatically");
        System.out.println("UC5 formation setup completed");




    }
}
