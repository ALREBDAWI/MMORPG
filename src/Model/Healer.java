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

    //getter and setter
    public int getHealingPoints() {
        return this.healingPoints;
    }
    public void setHealingPoints(int pHealingPoints) {
        this.healingPoints = pHealingPoints;
    }
}
