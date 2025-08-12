package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Burglar extends Person {

    int abilityPoints; //ability to steal, points only for burglars (PDH in French)
    private static ArrayList<Burglar> burglars = new ArrayList<Burglar>(); // create a list of burglars

    //constructor
    public Burglar(String pName, String pRace, String pCategory, int pLevel, int pHp, int pAbilityPoints) {
        super(pName, pRace, pCategory, pLevel, pHp);
        this.abilityPoints = getAbilityPoints();
    }

    //getter and setter
    public int getAbilityPoints() {
        return this.abilityPoints;
    }
    public void setAbilityPoints(int pAbilityPoints) {
        this.abilityPoints = pAbilityPoints;
    }


}


