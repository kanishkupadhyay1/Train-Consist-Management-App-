import java.util.*;

public class TrainConsistManagementApp {


    public static void main(String[] args){
        System.out.println("========================================================");
        System.out.println("===UC3: Track Unique Bogie IDs (Set – HashSet)\n===");
        System.out.println("========================================================\n");
        Set<String> passengerBogies=new HashSet<>();
        passengerBogies.add("BG101");
        passengerBogies.add("BG102");
        passengerBogies.add("BG103");
        passengerBogies.add("BG104");
        passengerBogies.add("BG105");

        passengerBogies.add("BG101");
        passengerBogies.add("BG102");



        System.out.println("Bogie IDs Insertion :\n"+passengerBogies);

        System.out.println("\n\nDuplicate are automatically ignored by HashSet.");
        System.out.println("\nUC3 uniqueness validation completed");






    }
}
