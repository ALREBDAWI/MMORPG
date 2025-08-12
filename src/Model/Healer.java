package Model;

import java.util.ArrayList;

public class Healer extends Person {

    int healingPoints; //only for healers; (PDM in French)
    private ArrayList<Healer> healers = new ArrayList<Healer>(); // list of all healers

    //constructor
    public Healer(String pName, String pRace, String pCategory, int pLevel, int pHp, int pHealingPoints) {
        super(pName, pRace, pCategory, pLevel, pHp);
        this.healingPoints = getHealingPoints();
    }

    //getter and setter
    public int getHealingPoints() {
        return this.healingPoints;
    }
    public void setHealingPoints(int pHealingPoints) {
        this.healingPoints = pHealingPoints;
    }
}
