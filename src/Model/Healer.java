package Model;

import java.util.ArrayList;

public class Healer extends Person {

    int healingPoints; //only for healers; (PDM in French)
    private ArrayList<Healer> healers = new ArrayList<Healer>(); // list of all healers

    //constructor
    public Healer(String pName, Race pRace, Category pCategory, int pLevel, int pHp, int pHealingPoints) {
        super(pName,pCategory, pRace, pLevel, pHp); //in order is in Person class constructor
        this.setHealingPoints(pHp);
        healers.add(this); //add healer to healers array
    }

    //constructor
    public Healer(String pName, Race pRace, Category pCategory) {
        super(pName,pCategory, pRace); //in order is in Person class constructor
        this.setHealingPoints(35);
        healers.add(this); //add healer to healers array
    }


    //getter and setter
    public int getHealingPoints() {
        return this.healingPoints;
    }
    public void setHealingPoints(int pHealingPoints) {
        this.healingPoints = pHealingPoints;
    }


    @Override
    public String toString() {
        return String.format(
                "Healer: %s%n" +
                        "  Race: %s%n" +
                        "  Category: %s%n" +
                        "  Level: %d%n" +
                        "  HP: %d%n" +
                        "  Healing points: %d",
                getName(),
                getRace().getName(),
                getCategory().getName(),
                getLevel(),
                getHp(),
                getHealingPoints()
        );
    }
}
