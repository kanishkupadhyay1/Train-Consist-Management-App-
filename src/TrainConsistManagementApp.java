import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;

class Bogie {
    String type;
    String cargo;

    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Bogie> bogies = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Open", "Coal"),
                new Bogie("Box", "Grain"),
                new Bogie("Cylindrical", "Coal")
        );

        boolean isSafe = bogies.stream().allMatch(b -> {
            if (b.type.equals("Cylindrical")) {
                return b.cargo.equals("Petroleum");
            }
            return true;
        });

        System.out.println("\nGoods Bogies in Train:");
        bogies.forEach(System.out::println);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }
    }
    }




