package Controller;

import Model.*;

import java.util.Scanner;

public class CreatPerson {
    public static Person createPerson(){
        //creating players
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter role");
        String role = sc.nextLine();
        System.out.println("Enter the name of the category");
        String categoryKey = sc.nextLine();
        System.out.println("Enter the name of the race");
        String raceKey = sc.nextLine();
        System.out.println("Enter the name of the player");
        String playerName = sc.nextLine();

        switch (role) {
            case "warrior":
                return new Warrior(playerName, Race.getRaces().get(raceKey), Category.getCategories().get(categoryKey));
            case "burglar":
                return new Burglar(playerName, Race.getRaces().get(raceKey), Category.getCategories().get(categoryKey));
            case "healer":
                return new Healer(playerName, Race.getRaces().get(raceKey), Category.getCategories().get(categoryKey));
            default:
                System.out.println("Invalid entry");
                return null;
        }

    }
}
