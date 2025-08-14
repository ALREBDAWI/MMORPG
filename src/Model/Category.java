package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Category {    // classe in French

    //variables
    private String name;
    private String weapon;
    private String armor;

    //creating map
    private static Map<String, Category> categories = new HashMap<>();

    //constructor
    public Category(String pName, String pWeapon, String pArmor) {
        this.setName(pName);
        this.setWeapon(pWeapon);
        this.setArmor(pArmor);
    }

    //getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String pName) {
        this.name=pName;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public void setWeapon(String pWeapon){
        this.weapon = pWeapon;
    }

    public String getArmor(){
        return this.armor;
    }

    public void setArmor(String pArmor){
        this.armor = pArmor;
    }

    public static Map<String, Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return " Category --> name : " + this.getName() + ", weapon : " + this.getWeapon() + ", armor : " + this.getArmor() + "\n";
    }
    //test
    public static void main(String[] args) {

    Category catIron = new Category("iron", "sword", "iron armor");
    categories.put(catIron.getName(), catIron);
    Category catBronze = new Category("bronze", "sickle", "bronze armor");
    categories.put(catBronze.getName(), catBronze);
        System.out.println(categories.get("iron") +  " " + categories.get("bronze"));


        //-----------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter category name: ");
            String Name = sc.nextLine();
            System.out.println("Enter weapon : ");
            String Weapon =  sc.nextLine();
            System.out.println("Enter armor : ");
            String armor =  sc.nextLine();
            Category.getCategories().put("cat" + Name, new Category(Name, Weapon, armor));
        }
        System.out.println(Category.getCategories().keySet().toString());

        //----------------------------------------------------------------------------------
    }
}
