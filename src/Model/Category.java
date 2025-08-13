package Model;

import java.util.HashMap;
import java.util.Map;

public class Category {

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


    //test
    public static void main(String[] args) {

    Category catIron = new Category("iron", "sword", "iron armor");
    categories.put(catIron.getName(), catIron);
    System.out.println(categories.get("catIron"));
    }
}
