package Controller;

import Model.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creating categories
        Category cat1 =  new Category("bronze", "sickle", "leather");
        Category cat2 =  new Category("iron", "sword", "iron");
        Category cat3 =  new Category("wood", "stick", "branch");
        Category.getCategories().put(cat1.getName(), cat1);
        Category.getCategories().put(cat2.getName(), cat2);
        Category.getCategories().put(cat3.getName(), cat3);
        for (String key : Category.getCategories().keySet()) {
            System.out.println(Category.getCategories().get(key));
        }

        //creating races
        Race race1 = new Race("Elf");
        Race race2 = new Race("Ork");
        Race race3 = new Race("Man");
        Race.getRaces().put("elf", race1);
        Race.getRaces().put("ork", race2);
        Race.getRaces().put("man", race3);
        for (String key : Race.getRaces().keySet()) {
            System.out.println(Race.getRaces().get(key));

        }

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