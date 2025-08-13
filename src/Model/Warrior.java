package Model;

import java.util.ArrayList;

public class Warrior extends Person {

    int forcePoints; //only for warriors, (PDF in French)
    private ArrayList<Warrior> warriors = new ArrayList<Warrior>(); //list of warriors

    //constructor
    public Warrior(String pName, Race pRace, Category pCategory, int pLevel, int pHp, int pForcePoints) {
        super(pName ,pCategory,pRace, pLevel, pHp);
        this.setForcePoints(pForcePoints);
        warriors.add(this); //add the warrior to warriors array
    }

    //getter and setter
    public int getForcePoints(){
        return this.forcePoints;
    }
    public void setForcePoints(int pForcePoints){
        this.forcePoints = pForcePoints;
    }

}
