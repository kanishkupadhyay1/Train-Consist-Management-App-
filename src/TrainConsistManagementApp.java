import java.util.*;

public class TrainConsistManagementApp {


    public static void main(String[] args){
        System.out.println("========================================================");
        System.out.println("===UC6: Map Bogie To Capacity (HashMap)===");
        System.out.println("========================================================\n");
        Map<String,Integer> trainConsist = new HashMap();
        trainConsist.put("First Class",24);
        trainConsist.put("Cargo",120);
        trainConsist.put("Sleeper",72);
        trainConsist.put("AC Chair",56);

        for(String key : trainConsist.keySet()){
            System.out.println(key+" -> "+trainConsist.get(key));
        }








        System.out.println("UC6 bogie-capaciy mapping completed...");




    }
}
