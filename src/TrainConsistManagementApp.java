import java.util.*;

public class TrainConsistManagementApp {


    public static void main(String[] args){
        System.out.println("========================================================");
        System.out.println("===UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)\n===");
        System.out.println("========================================================\n");
        List<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");





        System.out.println("Initial Train Consist :\n"+trainConsist);

        System.out.println("\n\nAfter Insertion 'Pantry Car' at Position 2:");
        trainConsist.add(2,"Pantry Car");
        System.out.println(trainConsist);

        System.out.println("\n\nAfter Removing First and last Bogie:");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println(trainConsist);

        System.out.println("\nUC4 Ordered consist Operation completed...");






    }
}
