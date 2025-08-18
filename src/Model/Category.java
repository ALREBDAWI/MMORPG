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

    static {
        //creating categories
        Category cat1 =  new Category("bronze", "sickle", "leather");
        Category cat2 =  new Category("iron", "sword", "iron");
        Category cat3 =  new Category("wood", "stick", "branch");
        Category.getCategories().put(cat1.getName(), cat1);
        Category.getCategories().put(cat2.getName(), cat2);
        Category.getCategories().put(cat3.getName(), cat3);
        /*for (String key : Category.getCategories().keySet()) {
            System.out.println(Category.getCategories().get(key));
        }*/
    }

    public static Map<String, Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return " Category --> name : " + this.getName() + ", weapon : " + this.getWeapon() + ", armor : " + this.getArmor() + "\n";
    }

}
