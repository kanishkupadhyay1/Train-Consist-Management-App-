import java.util.*;

public class TrainConsistManagementApp {

    public static  void addBogies(List<String> list,String type){
            list.add(type);
}

public static void removeBogie(String type,List<String> list){
        list.remove(type);
}

public static void checkAvailability(String type,List<String> list){
        if(list.contains(type)){
            System.out.println("\ncheck if "+type+" exists:");
            System.out.println("Contains "+type+" ? : true");

        }else{
            System.out.println("\ncheck if "+type+" exists:");
            System.out.println("Contains "+type+" ? : false");
        }
}
    public static void main(String[] args){
        System.out.println("========================================================");
        System.out.println("===UC2: Add Passenger Bogies to Train (ArrayList Operations)===");
        System.out.println("========================================================\n");
        List<String> passengerBogies=new ArrayList<>();

        System.out.println("After Adding  Bogies:");
        addBogies(passengerBogies,"Sleeper");
        addBogies(passengerBogies,"Ac chair");
        addBogies(passengerBogies,"First class");
        System.out.println("Passenger Bogies : "+passengerBogies);


        System.out.println("\nAfter Removing Ac chair:");
        System.out.println("Passenger Bogies : "+passengerBogies);

        checkAvailability("Sleeper",passengerBogies);


        System.out.println("\nFinal Train Passenger Consist : "+passengerBogies);

        System.out.println("UC2 operations completed successfully");







    }
}
