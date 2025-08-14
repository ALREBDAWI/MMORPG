package Model;

import java.util.ArrayList;

public class Burglar extends Person {

    int abilityPoints; //ability to steal, points only for burglars (PDH in French)
    private static ArrayList<Burglar> burglars = new ArrayList<Burglar>(); // create a list of burglars

    //constructor
    public Burglar(String pName, Race pRace, Category pCategory, int pLevel, int pHp, int pAbilityPoints) {
        super(pName, pCategory,pRace, pLevel, pHp);
        this.setAbilityPoints(pAbilityPoints);
        burglars.add(this);
    }
    //constructor
    public Burglar(String pName, Race pRace, Category pCategory) {
        super(pName, pCategory,pRace);
        this.setAbilityPoints(35);
        burglars.add(this);
    }

    //getter and setter
    public int getAbilityPoints() {
        return this.abilityPoints;
    }
    public void setAbilityPoints(int pAbilityPoints) {
        this.abilityPoints = pAbilityPoints;
    }

    @Override
    public String toString() {
        return String.format(
                "Burglar: %s%n" +
                        "  Race: %s%n" +
                        "  Category: %s%n" +
                        "  Level: %d%n" +
                        "  HP: %d%n" +
                        "  Force Points: %d",
                getName(),
                getRace().getName(),
                getCategory().getName(),
                getLevel(),
                getHp(),
                getAbilityPoints()
        );
    }


}


