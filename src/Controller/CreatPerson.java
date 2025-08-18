package Controller;

import Model.*;

import java.util.Scanner;

public class CreatPerson {
    public static void main(String[] args) {

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
                    Warrior warrior = new Warrior(playerName, Race.getRaces().get(raceKey), Category.getCategories().get(categoryKey));
                    System.out.println(warrior);
                    break;
                case "burglar":
                    Burglar burglar = new Burglar(playerName, Race.getRaces().get(raceKey), Category.getCategories().get(categoryKey));
                    System.out.println(burglar);
                    break;
                case "healer":
                    Healer healer = new Healer(playerName, Race.getRaces().get(raceKey), Category.getCategories().get(categoryKey));
                    System.out.println(healer);
                    break;
            }



    }
}
